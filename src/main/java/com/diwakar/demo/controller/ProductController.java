package com.diwakar.demo.controller;

import com.diwakar.demo.model.Product;
import com.diwakar.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping ("/getProducts")
    public List getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getProducts/{prodID}")
    public Product getProductsById(@PathVariable int prodID){
        return service.getProductsById(prodID);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);

    }
    @DeleteMapping("/product/{prodID}")
    public void delete(@PathVariable int prodID){
        service.deleteProducts(prodID);
    }
}
