package com.cashmachine.service;

import com.cashmachine.entity.User;
import com.cashmachine.entity.enums.UserRoleEnum;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.getUser("colibri");

        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));


        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getUsername(),
                        user.getPassword(),
                        roles);

        return userDetails;

    }
}
