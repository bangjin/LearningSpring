package com.wx.learning.core;

import com.wx.learning.core.service.impl.DefaultUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringApp {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        DefaultUserService userService = context.getBean("userService", DefaultUserService.class);
        System.out.println(userService.getUserById(123));
    }
}
