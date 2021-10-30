package com.company;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class Product {

    private String productId ;
    private String name;
    private Integer count;

    public Product(String name, Integer count){
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

}
