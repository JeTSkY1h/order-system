package com.example.ordersystem.Orders;

import java.util.*;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;

    public List<Order> listOrders(){
        return orderRepo.list();
    }

    public void addOrder(Order order){
        orderRepo.add(order);
    }

    public Order getOrder(String id) {
        return orderRepo.get(id);
    }
}