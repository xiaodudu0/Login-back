package com.zy.dao;

import com.zy.model.User;


public interface UserDao {
    int insert(User record);

    int insertSelective(User record);

    User login(User user);
}