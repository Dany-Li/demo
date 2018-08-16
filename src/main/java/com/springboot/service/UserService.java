package com.springboot.service;
/*
 *@date 2018/8/13  10:13
 */


import com.springboot.bean.User;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String login(String username, String password) {
        return userMapper.login(username,password);
    }

    //根据用户名查找用户信息
    public User searchByUserName(String username) {
        User user = userMapper.selectByUserName(username);
        return user;
    }

    public User getUserName(String username) {
        return userMapper.getUserName(username);
    }

    //用户注册
    public void save(User user) {
        userMapper.insert(user);
    }

    //用户登录
    public User getUser(String username, String password) {
        return userMapper.getUser(username,password);
    }

    //查询是否存在该用户名，如果返回0说明不存在
    public boolean checkUser(String userName) {
        long count = userMapper.countUserName(userName);
        return count == 0;
    }
}
