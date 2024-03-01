package com.turkcell.ecommerceDemo.services.concretes;

import com.turkcell.ecommerceDemo.entities.Order;
import com.turkcell.ecommerceDemo.repositories.abstracts.OrderRepository;
import com.turkcell.ecommerceDemo.services.abstracts.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public String create(Order order)
    {
        orderRepository.add(order);
        return order.getId() + " added";
    }

    @Override
    public List<Order> read()
    {
        return orderRepository.getAll();
    }

    @Override
    public String update(Order order)
    {
        for (Order o: orderRepository.getAll())
        {
            if (o.getId() == order.getId()){
                orderRepository.update(order);
                return order.getId() + " updated";
            }
        }
        return order.getId() + " not found";
    }

    @Override
    public String delete(int id)
    {
        for (Order o: orderRepository.getAll())
        {
            if (o.getId() == id){
                orderRepository.delete(o);
                return id + " deleted";
            }
        }
        return id + " not found";
    }
}
