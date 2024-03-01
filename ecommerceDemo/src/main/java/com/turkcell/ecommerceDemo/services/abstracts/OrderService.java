package com.turkcell.ecommerceDemo.services.abstracts;

import com.turkcell.ecommerceDemo.entities.Order;

import java.util.List;

public interface OrderService {
    String create(Order order);
    List<Order> read();
    String update(Order order);
    String delete(int id);
}
