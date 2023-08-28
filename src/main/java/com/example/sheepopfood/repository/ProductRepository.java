package com.example.sheepopfood.repository;

import com.example.sheepopfood.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


        @Query(value = "SELECT p FROM Product p " +
                "JOIN Category c ON p.category.id = c.id " +
                "WHERE p.name LIKE %:name% OR c.name LIKE %:category_name%")
        List<Product> findByNameContainingOrCategory_Name(String name, String category_name);

}
