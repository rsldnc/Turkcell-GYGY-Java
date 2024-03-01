package com.turkcell.ecommerceDemo.controllers;

import com.turkcell.ecommerceDemo.entities.Order;
import com.turkcell.ecommerceDemo.repositories.abstracts.OrderRepository;
import com.turkcell.ecommerceDemo.repositories.concretes.OrderRepositoryImpl;
import com.turkcell.ecommerceDemo.services.abstracts.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String create(@RequestBody Order order)
    {
        return orderService.create(order);
    }

    @GetMapping
    public List<Order> read()
    {
        return orderService.read();
    }

    @PutMapping
    public String update(@RequestBody Order order)
    {
        return orderService.update(order);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        return orderService.delete(id);
    }
}
