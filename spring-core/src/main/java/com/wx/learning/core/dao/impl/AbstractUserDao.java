package com.wx.learning.core.dao.impl;

import com.wx.learning.core.dao.UserDao;
import com.wx.learning.core.entity.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository
public class AbstractUserDao implements UserDao {
    public User getUserById(int uid) throws SQLException {
        return null;
    }
}
