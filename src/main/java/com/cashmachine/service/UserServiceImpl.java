package com.cashmachine.service;

import com.cashmachine.dao.UserRepository;
import com.cashmachine.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setUsername(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220");

        return user;
    }

    @Override
    public List<User> getAllUsers()
    {
        return this.userRepository.getAllUsers();
    }

    @Override
    public Integer createUser(User user)
    {
        return this.userRepository.createUser(user);
    }
}
