package com.example.ordersystem.Orders;

import java.util.*;

import com.example.ordersystem.Products.Product;

import lombok.Data;

@Data
public class Order {
    private final String id = UUID.randomUUID().toString();
    private List<Product> products;

    Order(List<Product> products) {
        this.products = products;
    }

    
}