package com.wx.learning.core;

import com.wx.learning.core.dao.UserDao;
import com.wx.learning.core.dao.impl.DefaultUserDao;
import com.wx.learning.core.processor.InstantiationTracingBeanPostProcessor;
import com.wx.learning.core.service.UserService;
import com.wx.learning.core.service.impl.DefaultUserService;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public UserService defaultUserService() {
        return new DefaultUserService(userDao());
    }

    @Bean
    public UserDao userDao() {
        return new DefaultUserDao(dataSource());
    }

    @Bean
    @Scope("singleton")
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
        dataSource.setUrl("jdbc:hsqldb:mem:learning");
        dataSource.setUsername("SA");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public BeanPostProcessor instantiationTracingBeanPostProcessor() {
        return new InstantiationTracingBeanPostProcessor();
    }

}
