package com.cashmachine.service;


import com.cashmachine.config.SecurityConfig;
import com.cashmachine.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = SecurityConfig.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    //@WithMockUser(username = "john")
    public void testGetUser() {
        User john = userService.getUser("john");
        assertEquals("john", john.getUsername());
    }
}