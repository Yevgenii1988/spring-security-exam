package com.cashmachine.service;

import com.cashmachine.entity.User;

import java.util.List;

public interface UserService {

    User getUser(String login);
    List<User> getAllUsers();
    Integer createUser(User user);
}
