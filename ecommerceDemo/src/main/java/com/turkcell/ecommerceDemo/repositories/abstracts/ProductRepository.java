package com.turkcell.ecommerceDemo.repositories.abstracts;

import com.turkcell.ecommerceDemo.entities.Product;

import java.util.List;

public interface ProductRepository {
    void add(Product product);
    List<Product> getAll();
    public void delete(Product product);
    public void update(Product product);
}
