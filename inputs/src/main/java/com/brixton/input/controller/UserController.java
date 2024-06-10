package com.brixton.input.controller;

import com.brixton.input.dto.request.UserRequestDTO;
import com.brixton.input.dto.response.UserResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/v1/user")
@Slf4j
public class UserController {
    Map<String, UserRequestDTO> userInputs = new HashMap<>();
    Map<String, UserResponseDTO> userOutputs = new HashMap<>();
    Map<String, String> userLoggeds =new HashMap<>();

    /**
     * endpoint: POST | /
     * Crea un nuevo usuario
     *
     * @param input
     * @return
     */
    @PostMapping("/")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO input){
        /**
         * Proceso de Registro De Usuario:
         * 1. Almacena el valor de entrada en una coleccion, userInputs
         * 2. Crea un objeto de tipo UserResponseDTO, con el objetivo de colocar el valor de fecha de creacion
         *    Es decir, createAt.
         * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, userOutputs
         * 4. Devuelvo el objeto creado (paso 2)
         */
        userInputs.put(String.valueOf(input.getUserName()), input);//usamos como key el "userName"
        //Almacena la información para ser devuelta al UserResponseDTO
        UserResponseDTO userTemp = new UserResponseDTO();
        userTemp.setId(input.getId());
        userTemp.setUserName(input.getUserName());
        userTemp.setFirstName(input.getFirstName());
        userTemp.setLastName(input.getLastName());
        userTemp.setEmail(input.getEmail());
        userTemp.setPassword(input.getPassword());
        userTemp.setPhone(input.getPhone());
        userTemp.setUserStatus(input.getUserStatus());
        userTemp.setCreatedAt(LocalDate.now().toString());

        userOutputs.put(String.valueOf(input.getUserName()), userTemp);
        return ResponseEntity.ok(userTemp);
        //return new ResponseEntity<>(HttpStatusCode.valueOf(204));
    }

    /**
     * endpoint: GET | /{userName}
     * Obtiene el usuario encontrado, sino devuelve error 404 (Not Found)
     * @param userName
     * @return
     */
    @GetMapping("/{userName}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable String userName){
        /**
         * Proceso de Obtener 1 usuario - por esto la key es el userName
         * 1. Buscar el userName en el Map
         * 2. En caso exista: Devolver la informacion del Paso 1
         * 3. En caso no exista: Mensaje indicando que no se encontró 404
         */
        UserResponseDTO userFound= userOutputs.get(userName);
        if (userName!=null){
            return ResponseEntity.ok(userFound);
        } else {
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }

//        for (UserResponseDTO parcial: userOutputs.values()){
//            if (userName.equals(parcial.getUserName())){
//                userFound=parcial; //asigna el contenido de parcil en userFound
//                return ResponseEntity.ok(userFound);
//            }
//        }
        /*if(userFound!=null){
            return ResponseEntity.ok(userFound);
        }*/
       // return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
    }

    /**
     * endpoint: PUT | /{userName}
     * Actualizar la informacion de un User que está logueado
     * @return 200 + objeto actualizado
     *          404 Si no se pudo actualizar
     */
    @PutMapping("/{userName}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable String userName, @RequestBody UserRequestDTO userAActualizar) {
        /**
         * Proceso de actualizar usuario
         * 1. Buscar el User utilizando el userName ingresado
         * 2. En caso exista: Acualizar la información en el objeto encontrado
         * 3. En caso no exista: devolver 404
         */
        UserResponseDTO userTemp= userOutputs.get(userName);
        if (userTemp != null) { //En caso Exista
            userTemp.setId(userAActualizar.getId());
            //userTemp.setUserName(userAActualizar.getUserName());//No debe hacerse porque se altera el identificador o key de la colección
            userTemp.setFirstName(userAActualizar.getFirstName());
            userTemp.setLastName(userAActualizar.getLastName());
            userTemp.setEmail(userAActualizar.getEmail());
            userTemp.setPassword(userAActualizar.getPassword());
            userTemp.setPhone(userAActualizar.getPhone());
            userTemp.setUserStatus(userAActualizar.getUserStatus());
            //userTemp.setCreatedAt();//No debe hacerse porque se altera la fecha de creacion
            userTemp.setUpdateAt(LocalDateTime.now().toString());
            return ResponseEntity.ok(userTemp);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }

    }

    /**
     * endpoint: GET | /
     * Obtiene la lista de users registrados.
     * @return
     */
    @GetMapping("/")
    public ResponseEntity<List<UserResponseDTO>> getUsers(){
        /**
         * Proceso de Obtener usuarios registrados
         * 1. Convertir el Mapa de userOutputs a una Lista
         * 2. Devolver la lista
         */
        List<UserResponseDTO> userTemps = new ArrayList<>();
        userTemps.addAll(userOutputs.values());

        //return ResponseEntity.ok(new ArrayList<>(petOutputs.values()));
        return ResponseEntity.ok(userTemps);
    }

    /**
     * endpoint: DELETE | /{userName}
     * Elimina un User que se encuentre logueado
     * @return  204 si se elimino con exito
     *          404 si no se pudo eliminar -no se encontro el user, -identificador malformado-
     */
    @DeleteMapping("/{userName}")
    public ResponseEntity deleteUser(@PathVariable String userName, @RequestParam String userDelete){
        /**
         * Proceso de eliminar usuario
         * 1. Verificar que el user este logueado,
         * 2. Buscar el userName en el MAP
         * 3. En caso exista: debe eliminarse y devolver 204.
         * 4. En caso no exista: devolver 404
         */
        String logged = userLoggeds.get(userName);
        UserResponseDTO userTemp = userOutputs.get(userName); //Paso 2.
        if (userTemp != null && !userName.equals(userDelete) && userName.equals(logged)) {
            userOutputs.remove(userName);
            return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
        } else{
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }

    /**
     * endpoint: POST | /createWithList
     * Crea una lista de usuarios con una matriz de entrada determinada
     * @param newUsers
     * @return
     */
    @PostMapping("/createWithList")
    public ResponseEntity<List<UserResponseDTO>> createWithList(@RequestBody List<UserRequestDTO> newUsers) {
        /**
         * Proceso de crear usuarios con una lista
         * 1. Recorremos con un foreach la lista newUsers,
         * 2. Colocamos los newUsers en el map userInputs, luego colocamos en userOutputs
         * 3. En caso de éxito: debe mostrar la lista de usuarios creados.
         *
         */
        for (UserRequestDTO input : newUsers) {
            userInputs.put(String.valueOf(input.getUserName()), input);
            UserResponseDTO responseUser = new UserResponseDTO();
            responseUser.setId(input.getId());
            responseUser.setUserName(input.getUserName());
            responseUser.setFirstName(input.getFirstName());
            responseUser.setLastName(input.getLastName());
            responseUser.setEmail(input.getEmail());
            responseUser.setPassword(input.getPassword());
            responseUser.setPhone(input.getPhone());
            responseUser.setUserStatus(input.getUserStatus());
            responseUser.setCreatedAt(LocalDate.now().toString());
            userOutputs.put(String.valueOf(responseUser.getUserName()), responseUser);
            //log.info("info de mapa outputs: "+responseUser.toString());
        }
        List<UserResponseDTO> responseList = new ArrayList<>(userOutputs.values());
        return ResponseEntity.status(HttpStatus.CREATED).body(responseList);
        //return ResponseEntity.status(HttpStatus.CREATED).body((List)(userOutputs.values()));

    }

    @GetMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@RequestParam(name="userName") String userName,@RequestParam(name="pwd") String pwd){
        UserResponseDTO userTemp =userOutputs.get(userName);
        if (userTemp!=null && userTemp.getPassword().equals(pwd)){
            String logged = userLoggeds.get(userName);
            if (logged==null){
                userLoggeds.put(userTemp.getUserName(), userTemp.getUserName());
                return new ResponseEntity<>(HttpStatusCode.valueOf(200));
            } else {
                return new ResponseEntity<>(HttpStatusCode.valueOf(500));
            }
        }   else {
                return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }
    }

    @GetMapping("/logout")
    public ResponseEntity<UserResponseDTO> logout(@RequestParam String userName) {
        String logged = userLoggeds.get(userName);

        if (logged != null) {
            userLoggeds.remove(logged);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }


}
