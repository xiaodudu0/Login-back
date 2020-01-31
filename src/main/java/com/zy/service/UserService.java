package com.zy.service;

import com.zy.model.MyResult;
import com.zy.model.User;

public interface UserService {
    MyResult login(User user);
}
