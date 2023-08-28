package com.example.sheepopfood.controller.rest;

import com.example.sheepopfood.model.Product;
import com.example.sheepopfood.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
@AllArgsConstructor
public class ProductRestController {
    public final ProductService productService;
    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Product> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
