package com.brixton.gestionusuario.controller;

import com.brixton.gestionusuario.dto.request.UserRequestDTO;
import com.brixton.gestionusuario.model.User;
import com.brixton.gestionusuario.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/")
    public ResponseEntity<Object> createUser(@RequestBody UserRequestDTO input){
        return ResponseEntity.ok(userService.createUser(input));
        //return null;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Object> getUser(@PathVariable int userId){
        Object userTemporal = userService.getUser(userId);
        if (userTemporal != null) {
            return ResponseEntity.ok(userTemporal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Object> updateUser(@PathVariable int userId, @RequestBody UserRequestDTO userActualizar) {
        Object userUpdate = userService.updateUser(userId, userActualizar);
        if(userUpdate != null){
            return ResponseEntity.ok(userUpdate);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }
    @GetMapping("/{userId}/roles")
    public ResponseEntity<List<String>> getRolOfUser(@PathVariable int userId){
        List<String> rolOfUser = userService.getRolOfUser(userId);
        if (!rolOfUser.isEmpty()){
            return ResponseEntity.ok(rolOfUser);
        } else {
            return new ResponseEntity<>(HttpStatusCode.valueOf(404)); // retorna 404
        }
    }
    @GetMapping("/{userId}/permission")
    public ResponseEntity<Object> getPermissionOfUser(@PathVariable int userId){
//        Object orderFound = storeService.getOrder(orderId);
//        if (orderFound != null) {
//            return ResponseEntity.ok(orderFound);
//        } else {
//            return ResponseEntity.notFound().build(); // retorna 404
//        }
        return null;
    }




}
