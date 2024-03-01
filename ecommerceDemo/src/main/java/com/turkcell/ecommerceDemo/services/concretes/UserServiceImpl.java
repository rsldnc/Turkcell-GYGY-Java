package com.turkcell.ecommerceDemo.services.concretes;

import com.turkcell.ecommerceDemo.entities.User;
import com.turkcell.ecommerceDemo.repositories.abstracts.UserRepository;
import com.turkcell.ecommerceDemo.services.abstracts.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String create(User user)
    {
        userRepository.add(user);
        return user.getFullName() + " added";
    }

    @Override
    public List<User> read()
    {
        return userRepository.getAll();
    }

    @Override
    public String update(User user)
    {
        for (User u: userRepository.getAll())
        {
            if (u.getId() == user.getId()){
                userRepository.update(user);
                return user.getId() + " updated";
            }
        }
        return user.getId() + " not found";
    }

    @Override
    public String delete(int id)
    {
        for (User u: userRepository.getAll())
        {
            if (u.getId() == id){
                userRepository.delete(u);
                return id + " deleted";
            }
        }
        return id + " not found";
    }
}
