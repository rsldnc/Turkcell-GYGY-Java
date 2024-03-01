package com.turkcell.ecommerceDemo.repositories.abstracts;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.entities.Order;

import java.util.List;

public interface OrderRepository {
    void add(Order order);
    List<Order> getAll();
    public void delete(Order order);
    public void update(Order order);
}
