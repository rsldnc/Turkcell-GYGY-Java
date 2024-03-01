package com.turkcell.ecommerceDemo.controllers;

import com.turkcell.ecommerceDemo.entities.User;
import com.turkcell.ecommerceDemo.repositories.abstracts.UserRepository;
import com.turkcell.ecommerceDemo.repositories.concretes.UserRepositoryImpl;
import com.turkcell.ecommerceDemo.services.abstracts.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String create(@RequestBody User user)
    {
        return userService.create(user);
    }

    @GetMapping
    public List<User> read()
    {
        return userService.read();
    }

    @PutMapping
    public String update(@RequestBody User user)
    {
        return userService.update(user);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        return userService.delete(id);
    }
}
