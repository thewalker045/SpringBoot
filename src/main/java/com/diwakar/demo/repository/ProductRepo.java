package com.diwakar.demo.repository;

import com.diwakar.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    //used foro creating or refering an object
}
