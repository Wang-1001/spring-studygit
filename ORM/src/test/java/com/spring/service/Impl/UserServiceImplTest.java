package com.spring.service.Impl;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertUser(){
        User user = new User();
        user.setAccount("insert");
        user.setPassword("12345");
        user.setCredits(54321);
        int n = userService.insertUser(user);
        assertEquals(1, n);

    }

    @Test
    public void deleteUser() {
        int n = userService.deleteUser(5);
        assertEquals(1,n);
    }

    @Test
    public void updateUser() {
        User user = userService.getUser(2);
        user.setPassword("222");
        user.setCredits(22222);
        int n = userService.updateUser(user);
        assertEquals(1, n);
    }

    @Test
    public void getUser() {
        User user = userService.getUser(4);
        System.out.println(user);
    }


    @Test
    public void selectUsers() {
        List<User> users = userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
}