package com.brixton.input.controller;

import com.brixton.input.dto.request.StoreGenericRequestDTO;
import com.brixton.input.dto.response.PetResponseDTO;
import com.brixton.input.dto.response.StoreResponseDTO;
import com.brixton.input.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@Slf4j
@RequestMapping("/v1/store")
public class StoreController {
    @Autowired
    private StoreService storeService;
    Map<String, StoreGenericRequestDTO> storeInputs = new HashMap<>();
    Map<String, StoreResponseDTO> storeOutputs = new HashMap<>();

    @PostMapping("/order")
    public ResponseEntity<Object> placeOrder(@RequestBody StoreGenericRequestDTO input){
        return ResponseEntity.ok(storeService.saveOrder(input));
//        storeInputs.put(String.valueOf(input.getId()), input);
//        //Almacena la informacion para ser devuelta -response-
//        StoreResponseDTO storeTemp = new StoreResponseDTO();
//        storeTemp.setId(input.getId());
//        storeTemp.setPetId(input.getPetId());
//        storeTemp.setQuantity(input.getQuantity());
//        storeTemp.setStatus(input.getStatus());
//        storeTemp.setShipDate(LocalDate.now().toString());
//        storeTemp.setComplete(input.isComplete());
//        storeTemp.setCreatedAt(LocalDate.now().toString());
//
//        storeOutputs.put(String.valueOf(input.getId()), storeTemp);
//        //return ResponseEntity.ok(ptr);
//        //return new ResponseEntity<>(HttpStatusCode.valueOf(204));
//        return ResponseEntity.ok(storeTemp);
    }

    @GetMapping("/inventory/{status}")
    public ResponseEntity<List<Object>> getInventory(@PathVariable String status) {
        List<Object> ordersFound = storeService.getInventory(status);
        if (!ordersFound.isEmpty()){
            return ResponseEntity.ok(ordersFound);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404)); // retorna 404
        }

    }

    //---GET {petId} encontrar orden de compra por orderID
    @GetMapping("/order/{orderId}")
    public ResponseEntity<Object> getOrder(@PathVariable int orderId){
        Object orderFound = storeService.getOrder(orderId);
        if (orderFound != null) {
            return ResponseEntity.ok(orderFound);
        } else {
            return ResponseEntity.notFound().build(); // retorna 404
        }
//        StoreResponseDTO storeTemp = storeOutputs.get(orderId); // traer la orden
//        int idOrder = Integer.parseInt(orderId); //convertir a integer
    }

    //-----DELETE
    @DeleteMapping("/order/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable int orderId){
        boolean successfull = storeService.deleteOrder(orderId);
        if (successfull){
            return new ResponseEntity<>(HttpStatusCode.valueOf(204));
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
//        try {
//            StoreResponseDTO storeTemp = storeOutputs.get(orderId); //Paso 1.
//            int idOrder = Integer.parseInt(orderId); //convertir a integer
//            if (storeTemp != null) {
//                storeOutputs.remove(String.valueOf(idOrder));
//                return new ResponseEntity<>(HttpStatusCode.valueOf(204)); //Paso 2.
//            } else{
//                return new ResponseEntity<>(HttpStatusCode.valueOf(404));
//            }
//        } catch (NumberFormatException e){
//            return new ResponseEntity<>(HttpStatusCode.valueOf(404));
//        }


    }


}
