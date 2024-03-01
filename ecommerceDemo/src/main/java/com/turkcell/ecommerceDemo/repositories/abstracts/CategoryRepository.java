package com.turkcell.ecommerceDemo.repositories.abstracts;

import com.turkcell.ecommerceDemo.entities.Address;
import com.turkcell.ecommerceDemo.entities.Category;
import com.turkcell.ecommerceDemo.entities.Product;

import java.util.List;

public interface CategoryRepository {
    void add(Category category);
    List<Category> getAll();
    public void delete(Category category);
    public void update(Category category);
}
