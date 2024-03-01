package com.turkcell.ecommerceDemo.services.abstracts;

import com.turkcell.ecommerceDemo.entities.Category;

import java.util.List;

public interface CategoryService {
    String create(Category category);
    List<Category> read();
    String update(Category category);
    String delete(int id);
}
