package com.diwakar.demo.service;

import com.diwakar.demo.model.Product;
import com.diwakar.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101,"camera",25000),
//            new Product(102,"Iphone",70000),
//            new Product( 103, "laptop", 80000)));
//    public List<Product> getProducts(){
//        return products;
//    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductsById(int ProdID) {
       return repo.findById(ProdID).orElse(null);
    }



    public void updateProduct(Product prod) {
        int index=0;

       repo.save(prod);
        }

    public void deleteProducts(int prodID) {

        repo.deleteById(prodID);
    }
}

