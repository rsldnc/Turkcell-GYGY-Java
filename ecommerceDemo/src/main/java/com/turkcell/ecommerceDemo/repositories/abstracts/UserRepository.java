package com.turkcell.ecommerceDemo.repositories.abstracts;

import com.turkcell.ecommerceDemo.entities.Category;
import com.turkcell.ecommerceDemo.entities.User;

import java.util.List;

public interface UserRepository {
    void add(User user);
    List<User> getAll();
    public void delete(User user);
    public void update(User user);
}
