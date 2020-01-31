package com.zy.service.impl;

import com.zy.dao.UserDao;
import com.zy.model.MyResult;
import com.zy.model.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public MyResult login(User user) {
        User u = null;
        List<User> list = new ArrayList<User>();
        u = userDao.login(user);
        MyResult result = new MyResult();
        if(u!=null){
            result.setCode(0);
            result.setMsg("登陆成功!");
            list.add(u);
            result.setList(list);
        }else{
            result.setCode(1);
            result.setMsg("登陆失败!");
        }
        return result;

    }
}
