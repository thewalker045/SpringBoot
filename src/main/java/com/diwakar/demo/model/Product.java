package com.diwakar.demo.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price;

    public Product() {
        System.out.println("The object is autowired");
    }

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
}
