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
<<<<<<< HEAD
    private Integer id;
    private String image;
=======
    private Long id;
>>>>>>> 7d284d52969053c5b3451448c36463f836563c98
    private String name;
    private BigDecimal price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean isAvailable;
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

}
