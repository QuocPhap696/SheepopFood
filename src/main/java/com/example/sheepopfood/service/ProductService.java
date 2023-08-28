package com.example.sheepopfood.service;

import com.example.sheepopfood.model.Product;
import com.example.sheepopfood.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    public final ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
