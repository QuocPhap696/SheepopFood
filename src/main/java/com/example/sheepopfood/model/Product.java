package com.example.sheepopfood.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean isAvailable;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

}
