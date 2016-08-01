package com.wx.learning.core.dao;

import com.wx.learning.core.entity.User;

import java.sql.SQLException;

public interface UserDao {
    User getUserById(int uid) throws SQLException;
}
