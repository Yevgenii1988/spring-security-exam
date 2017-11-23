package com.cashmachine.service;

import com.cashmachine.config.SecurityConfig;
import com.cashmachine.entity.enums.UserRoleEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = SecurityConfig.class)
public class UserDetailsServiceImplTest {

    @Autowired
    UserService userService;

    @Autowired
    UserDetailsService userDetailsService;

    @Test
    public void testLoadUserByUsername() {
        UserDetails userDetails = userDetailsService.loadUserByUsername("john");
        assertEquals("colibri", userDetails.getUsername());
    }
}