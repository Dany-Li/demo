package com.springboot.bean;
/*
 *@date 2018/8/6  19:55
 */

import java.util.Date;

/**
 * 用户
 */
public class User {

    private Integer userId;
    private String userName;
    private String password;
    private String gender;
    private String email;
    private String role;   //角色
   // private Date registerDate;   //注册时间




    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
