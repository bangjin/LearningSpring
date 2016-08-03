package com.wx.learning.core;

import com.wx.learning.core.service.impl.DefaultUserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringApp {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        context.registerShutdownHook();
        DefaultUserService userService = context.getBean(DefaultUserService.class);
        System.out.println(userService.getUserById(12));
    }
}
