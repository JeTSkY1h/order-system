package com.example.ordersystem.Products;

import java.util.UUID;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Product {
    private final String name;
    private final String id = UUID.randomUUID().toString();
}
