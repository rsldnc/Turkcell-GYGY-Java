package com.turkcell.ecommerceDemo.services.abstracts;

import com.turkcell.ecommerceDemo.entities.Product;

import java.util.List;

public interface ProductService {
    String create(Product product);
    List<Product> read();
    String update(Product product);
    String delete(int id);
}
