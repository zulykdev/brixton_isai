package com.brixton.input.controller;

import com.brixton.input.dto.request.StoreGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.dto.response.StoreResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
@RestController
@Slf4j
@RequestMapping("/v1/store")
public class StoreController {
    Map<String, StoreGenericRequestDTO> storeInputs = new HashMap<>();
    Map<String, StoreResponseDTO> storeOutputs = new HashMap<>();

    @PostMapping("/order")
    public ResponseEntity<StoreResponseDTO> placeOrder(@RequestBody StoreGenericRequestDTO input){
        /**
         * Proceso de Hacer Orden:
         * 1. Almacena el valor de entrada en una coleccion, storeInputs
         * 2. Crea un objeto de tipo StoreResponseDTO, con el objetivo de colocar el valor de fecha de creacion
         *    Es decir, shipDate.
         * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, storeOutputs
         * 4. Devuelvo el objeto creado (paso 2)
         */
        storeInputs.put(String.valueOf(input.getId()), input);
        //Almacena la informacion para ser devuelta -response-
        StoreResponseDTO storeTemp = new StoreResponseDTO();
        storeTemp.setId(input.getId());
        storeTemp.setPetId(input.getPetId());
        storeTemp.setQuantity(input.getQuantity());
        storeTemp.setStatus(input.getStatus());
        storeTemp.setShipDate(LocalDate.now().toString());
        storeTemp.setComplete(input.isComplete());

        storeOutputs.put(String.valueOf(input.getId()), storeTemp);
        //return ResponseEntity.ok(ptr);
        //return new ResponseEntity<>(HttpStatusCode.valueOf(204));
        return ResponseEntity.ok(storeTemp);

    }
    //---GET {petId} encontrar orden de compra por orderID
    @GetMapping("/order/{orderId}")
    public ResponseEntity<StoreResponseDTO> getOrder(@PathVariable String orderId){
        /**
         * Proceso de Obtener una orden de store por el ID
         * 1. Buscar el ID en el Map
         * 2. En caso exista: Devolver la informacion del Paso 1
         * 3. En caso no exista: Mensaje indicando que no se encontró
         */
        try {

            StoreResponseDTO storeTemp = storeOutputs.get(orderId); // traer la orden
            int idOrder = Integer.parseInt(orderId); //convertir a integer
            if (storeTemp != null) {
                return ResponseEntity.ok(storeTemp);
            } else {
                return ResponseEntity.notFound().build(); // retorna 404
            }
        } catch (NumberFormatException e) {
            return ResponseEntity.notFound().build(); // retorna 404 con cualquier informacion ingresda
        }
    }

    //-----DELETE
    @DeleteMapping("/order/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable String orderId){
        /**
         * Proceso de eliminar order en store
         * 1. Buscar el order con el Id ingresado
         * 2. En caso exista: debe eliminarse y devolver 204.
         * 3. En caso no exista: devolver 404
         */
        try {
            StoreResponseDTO storeTemp = storeOutputs.get(orderId); //Paso 1.
            int idOrder = Integer.parseInt(orderId); //convertir a integer
            if (storeTemp != null) {
                storeOutputs.remove(String.valueOf(idOrder));
                return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
            } else{
                return new ResponseEntity<>(HttpStatusCode.valueOf(404));
            }
        } catch (NumberFormatException e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
        }


    }


}
