package com.wx.learning.core;

import com.wx.learning.core.entity.User;
import com.wx.learning.core.service.UserService;
import com.wx.learning.core.service.impl.DefaultUserService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class SpringApp {
    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
        UserService userService1 = context.getBean("defaultUserService", UserService.class);
        System.out.println(userService1.getUserById(12));
    }
}
