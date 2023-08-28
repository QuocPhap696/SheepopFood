package com.example.sheepopfood.service;

import com.example.sheepopfood.model.Product;
import com.example.sheepopfood.repository.ProductRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> fillAll() {
        return productRepository.findAll();
    }
    public Product findById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product Create(Product product) {
        return productRepository.save(product);
    }
    public void update(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int productId) {
        productRepository.deleteById(productId);
    }

    public List<Product> findByNameContainingOrCategoryName(String name,String category_name){

        return productRepository.findByNameContainingOrCategory_Name(name, category_name);
    }
=======
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
>>>>>>> 7d284d52969053c5b3451448c36463f836563c98
}
