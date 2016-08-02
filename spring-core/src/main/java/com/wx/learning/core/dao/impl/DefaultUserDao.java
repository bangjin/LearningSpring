package com.wx.learning.core.dao.impl;

import com.wx.learning.core.dao.UserDao;
import com.wx.learning.core.entity.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.SQLException;

@Repository
@Qualifier("defaultUserDao")
public class DefaultUserDao implements UserDao {
//    private BasicDataSource dataSource;
//
//    @Autowired
//    public DefaultUserDao(BasicDataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    public User getUserById(int uid) throws SQLException {
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
        return new User();
    }
}
