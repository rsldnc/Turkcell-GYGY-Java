package com.turkcell.ecommerceDemo.services.abstracts;

import com.turkcell.ecommerceDemo.entities.User;

import java.util.List;

public interface UserService {
    String create(User user);
    List<User> read();
    String update(User user);
    String delete(int id);
}
