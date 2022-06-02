package com.example.ordersystem.Products;

import java.util.*;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public Product getPrdByName(String name){
        Optional<Product> res = productRepo.list().stream()
            .filter(p->p.getName().equals(name))
            .findFirst();
        return res.get();
    }

    public Product getProduct(String id){
        return productRepo.get(id).get();
    }

    public List<Product>listProducts(){
        return this.productRepo.list();
    }

    public void addProduct(Product product){
        productRepo.addProduct(product);
    }
    
}