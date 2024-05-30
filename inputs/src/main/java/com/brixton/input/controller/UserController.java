package com.brixton.input.controller;

import com.brixton.input.dto.request.PetGenericRequestDTO;
import com.brixton.input.dto.request.UserRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.dto.response.UserResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/v1/user")
@Slf4j
public class UserController {
    Map<String, UserRequestDTO> userInputs = new HashMap<>();
    Map<String, UserResponseDTO> userOutputs = new HashMap<>();

    @PostMapping("/")
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO input){
        /**
         * Proceso de Registro De Mascotas:
         * 1. Almacena el valor de entrada en una coleccion, petInputs
         * 2. Crea un objeto de tipo PetResponseDTO, con el objetivo de colocar el valor de fecha de creacion
         *    Es decir, createAt.
         * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, petOutputs
         * 4. Devuelvo el objeto creado (paso 2)
         */
        userInputs.put(String.valueOf(input.getId()), input);
        //Almacena la información para ser devuelta -response-
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

        userOutputs.put(String.valueOf(input.getId()), userTemp);
        //return new ResponseEntity<>(HttpStatusCode.valueOf(204));
        return ResponseEntity.ok(userTemp);
    }

    /**
     * endpoint: GET | /{userName}
     * Obtiene el usuario encontrada, sino devuelve 404 (Not Found)
     * @param userName
     * @return
     */
    @GetMapping("/{userName}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable String userName){
        /**
         * Proceso de Obtener 1 mascotas
         * 1. Buscar el userName en el Map
         * 2. En caso exista: Devolver la informacion del Paso 1
         * 3. En caso no exista: Mensaje indicando que no se encontró
         */
        try {

            UserResponseDTO userTemp = userOutputs.get(userName); // ubicar al usuario en userTemp
            if (userTemp != null) {
                return ResponseEntity.ok(userTemp);
            } else {
                return ResponseEntity.notFound().build(); // retorna 404
            }
        } catch (NumberFormatException e) {
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }
    }

    /**
     * endpoint: PUT | /{userName}
     * Actualizar la informacion de un User como admin del sistema
     * @return 200 + objeto actualizado
     *          404 Si no se pudo actualizar
     */
    @PutMapping("/{userId}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable String userId, @RequestBody UserRequestDTO userAActualizar) {
        /**
         * Proceso de actualizar usuario
         * 1. Buscar el User utilizando el Id ingresado
         * 2. En caso exista: Acualizar la información en el objeto encontrado
         * 3. En caso no exista: devolver 404
         */
        try {
            UserResponseDTO userTemp= userOutputs.get(userId); //Paso 1.
            if (userTemp != null) { //En caso Exista
                // userTemp.setId(); //No debe hacerse porque se altera el identificador
                userTemp.setUserName(userAActualizar.getUserName());
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
        }catch (NumberFormatException e){
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }

    }

    /**
     * endpoint: DELETE | /{userId}
     * Elimina un User como administrador
     * @return  204 si se elimino con exito
     *          404 si no se pudo eliminar -no se encontro el user, -identificador malformado-
     */
    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable int userId){
        /**
         * Proceso de eliminar usuario
         * 1. Buscar el user utilizando el Id ingresado
         * 2. En caso exista: debe eliminarse y devolver 204.
         * 3. En caso no exista: devolver 404
         */
        try {
            UserResponseDTO userTemp = userOutputs.get(userId); //Paso 1.
            if (userTemp != null) {
                userOutputs.remove(userId);
                return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
            } else{
                return new ResponseEntity<>(HttpStatusCode.valueOf(404));
            }
        } catch (NumberFormatException e){
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }

    }


}
