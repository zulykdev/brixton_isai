package com.brixton.gestionProduccion.controller;

import com.brixton.gestionProduccion.dto.request.ProductRequestDTO;
import com.brixton.gestionProduccion.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product/")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/")
    public ResponseEntity<Object> createProduct(@RequestBody ProductRequestDTO inputProduct){
        return  ResponseEntity.ok(productService.createProduct(inputProduct));
    }
    @GetMapping("/{idProduct}")
    public ResponseEntity<Object> getProduct(@PathVariable int idProduct){

        Object productTemporal = productService.getProduct(idProduct);

        if(productTemporal!= null){
            return ResponseEntity.ok(productTemporal);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("{idProduct}")
    public ResponseEntity<Object> updateProduct(@PathVariable int idProduct, @RequestBody ProductRequestDTO updateProduct){

        Object product = productService.updateProduct(idProduct, updateProduct);
        if(product != null){
            return ResponseEntity.ok(product);
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }

    @GetMapping("/categories")
    public ResponseEntity<List<String>> getCategory() {
        List<String> categori = productService.getCategory();
        if(!categori.isEmpty()){
            return ResponseEntity.ok(categori);
        }else{
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/{category}/inventory")
    public ResponseEntity<List<Object>> getInventoryByCategory(@PathVariable String category){
        List<Object> inventoriesByCategory = productService.getInventoryByCategory(category);
        if(!inventoriesByCategory.isEmpty()){
            return ResponseEntity.ok(inventoriesByCategory);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
