package com.example.ordersystem;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.example.ordersystem.Orders.Order;
import com.example.ordersystem.Orders.OrderService;
import com.example.ordersystem.Products.Product;
import com.example.ordersystem.Products.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ShopController {
    private final ProductService productService;
    private final OrderService orderService;
    
    @GetMapping("/product/byName/{name}")
    Product getProductByName(@PathVariable String name){
        return productService.getPrdByName(name);            
    }

    @GetMapping("/product/{id}")
    Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @GetMapping("/product/list")
    List<Product> listProducts(){
        return productService.listProducts();
    }

    @PostMapping("/product/{name}")
    void addProduct(@PathVariable String name) {
        productService.addProduct(new Product(name));
    }

    @GetMapping("/orders/list")
    List<Order> listOrders(){
        return orderService.listOrders();
    }

    @PostMapping("/orders")
    void addOrder(@RequestBody String[] OrderedProducts) {
        orderService.addOrder(OrderedProducts);
    }

    Order getOrder(String id) {
        return orderService.getOrder(id);
    }

}
