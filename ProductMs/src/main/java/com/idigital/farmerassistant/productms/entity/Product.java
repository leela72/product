package com.idigital.farmerassistant.productms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ProductId")
    private Long Id;
    @NotBlank(message = "name cannot be blank")
    private String productName;
    private String productType;
    @NotNull(message = "please enter valid number")
    private Long quantity;
    @Positive(message = "price should be a positive value")
    private Long price;
}
