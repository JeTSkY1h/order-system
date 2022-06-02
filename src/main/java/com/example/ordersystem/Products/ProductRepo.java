package com.example.ordersystem.Products;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {
    private Map<String, Product> products = new HashMap<>();

    ProductRepo(List<Product> productsList) {
        this.products = productsList.stream()
        .collect(Collectors.toMap(product -> product.getId(), product -> product));
    }

    public List<Product> list(){
        return this.products.values().stream().toList();
    }

    public Optional<Product> get(String id){
        return Optional.ofNullable(products.get(id));

    }

    public void addProduct(Product product){
        products.put(product.getId(), product);
    }

}