package com.wx.learning.core.service.impl;

import com.wx.learning.core.dao.UserDao;
import com.wx.learning.core.dao.impl.DefaultUserDao;
import com.wx.learning.core.entity.User;
import com.wx.learning.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class DefaultUserService implements UserService{

    @Autowired
    @Qualifier("defaultUserDao")
    private UserDao userDao;


    public User getUserById(int uid) {
        try {
            return userDao.getUserById(uid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
