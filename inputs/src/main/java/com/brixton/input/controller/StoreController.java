package com.brixton.input.controller;

import com.brixton.input.dto.request.StoreGenericRequestDTO;
import com.brixton.input.dto.response.StoreResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
@Slf4j
@RequestMapping("/v1/store")
public class StoreController {
    Map<String, StoreGenericRequestDTO> storeInputs = new HashMap<>();
    Map<String, StoreResponseDTO> storeOutputs = new HashMap<>();

    @PostMapping("/")
    public ResponseEntity<StoreResponseDTO> placeOrder(@RequestBody StoreGenericRequestDTO input){
        /**
         * Proceso de Hacer Orden:
         * 1. Almacena el valor de entrada en una coleccion, storeInputs
         * 2. Crea un objeto de tipo StoreResponseDTO, con el objetivo de colocar el valor de fecha de creacion
         *    Es decir, shipDate.
         * 3. Almacenar el objeto creado anteriormente (paso 2) en una coleccion, storeOutputs
         * 4. Devuelvo el objeto creado (paso 2)
         */

        return null;
    }



}
