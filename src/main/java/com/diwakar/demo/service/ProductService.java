package com.diwakar.demo.service;

import com.diwakar.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101,"camera",25000),
            new Product(102,"Iphone",70000),
            new Product( 103, "laptop", 80000)));
    public List<Product> getProducts(){
        return products;
    }

    public Product getProductsById(int ProdID) {
        for(Product i:products){
            if(i.getProdId()==ProdID) return i;
        }
    return null;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product prod) {
        int index=0;

        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId()==prod.getProdId()) index=i;

            products.set(index,prod);
        }
    }

