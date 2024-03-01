package com.turkcell.ecommerceDemo.repositories.concretes;

import com.turkcell.ecommerceDemo.entities.Order;
import com.turkcell.ecommerceDemo.repositories.abstracts.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orderList = new ArrayList<>();
    @Override
    public void add(Order order) {
        orderList.add(order);
    }

    @Override
    public List<Order> getAll() {
        return orderList;
    }

    @Override
    public void delete(Order order) {
        orderList.remove(order);
    }

    @Override
    public void update(Order order) {
        for (Order o: orderList)
        {
            if (o.getId() == order.getId()){
                o.setUserId(order.getUserId());
                o.setProducts(order.getProducts());
                o.setAddressId(order.getAddressId());
                o.setTotalPrice(order.getTotalPrice());
            }
        }
    }
}
