package com.springboot.mapper;
/*
 *@date 2018/8/6  20:36
 */


import com.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    String login(@Param("username") String username, @Param("password") String password);

    User selectByUserName(String username);


    //通过用户名进行查找
    User getUserName(String username);

    //用户注册
    void insert(User user);

    //用户登录
    User getUser(@Param(value = "username") String username,@Param(value = "password") String password);

    long countUserName(String userName);
}
