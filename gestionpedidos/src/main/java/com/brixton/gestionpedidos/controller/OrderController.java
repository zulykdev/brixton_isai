package com.brixton.gestionpedidos.controller;

import com.brixton.gestionpedidos.dto.request.OrderRequestDTO;
import com.brixton.gestionpedidos.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/orders")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/")
    public ResponseEntity<Object> saveOrder(@RequestBody OrderRequestDTO input){
        return ResponseEntity.ok(orderService.saveOrder(input));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Object> getOrder(@PathVariable int orderId){
        Object orderTemp = orderService.getOrder(orderId);
        if (orderTemp != null) {
            return ResponseEntity.ok(orderTemp);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/{orderId}/invoice")
    public ResponseEntity<Object> getInvoice(@PathVariable int orderId){
        Object orderTemp = orderService.getInvoice(orderId);
        //List<String> rolOfUser = userService.getRolOfUser(userId);
        if (orderTemp != null){
            return ResponseEntity.ok(orderTemp);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404)); // retorna 404
        }
    }

    @GetMapping("/{orderId}/shipping")
    public ResponseEntity<Object> getStatusShipping(@PathVariable int orderId){
        Object orderTemp = orderService.getStatusShipping(orderId);
        //List<String> rolOfUser = userService.getRolOfUser(userId);
        if (orderTemp!=null){
            return ResponseEntity.ok(orderTemp);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404)); // retorna 404
        }
    }

}
