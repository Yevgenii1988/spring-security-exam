package com.cashmachine.service;

import com.cashmachine.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser(String login) {
        User user = new User();
        user.setUsername(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }
}
