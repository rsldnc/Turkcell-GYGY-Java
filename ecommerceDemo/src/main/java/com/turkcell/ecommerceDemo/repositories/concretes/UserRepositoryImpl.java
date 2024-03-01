package com.turkcell.ecommerceDemo.repositories.concretes;

import com.turkcell.ecommerceDemo.entities.User;
import com.turkcell.ecommerceDemo.repositories.abstracts.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private List<User> userList = new ArrayList<>();
    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public List<User> getAll() {
        return userList;
    }

    @Override
    public void delete(User user) {
        userList.remove(user);
    }

    @Override
    public void update(User user) {
        for (User u: userList)
        {
            if (u.getId() == user.getId()){
                u.setFullName(user.getFullName());
                u.setMail(user.getMail());
                u.setPassword(user.getPassword());
            }
        }
    }
}
