package com.example.ordersystem.Orders;
import java.util.*;
import org.springframework.stereotype.Service;

import com.example.ordersystem.Products.Product;
import com.example.ordersystem.Products.ProductService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;
    private final ProductService productService;
   
    public List<Order> listOrders(){
        return orderRepo.list();
    }

    public void addOrder(String[] orderedProducts){
        List<Product> OrderedProds = Arrays.stream(orderedProducts).map(r-> productService.getPrdByName(r)).toList();
        
        orderRepo.add(new Order(OrderedProds));
    }

    public Order getOrder(String id) {
        return orderRepo.get(id);
    }
}