package com.springboot.bean;
/*
 *@date 2018/8/6  20:06
 */


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 问题表
 */
public class Question {

    private Integer queId;
    private String queTitle;   //问题的标题
    private String queContent;   //问题的内容
    private Integer uId;   //提问者的ID

    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queTime;   //提问的时间
    private Integer subjectId;    //提问的科目
    private Integer count;   //回答的数量

    private User user;    //用户

    private Subject subject;    //科目



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getQueId() {
        return queId;
    }

    public void setQueId(Integer queId) {
        this.queId = queId;
    }

    public String getQueTitle() {
        return queTitle;
    }

    public void setQueTitle(String queTitle) {
        this.queTitle = queTitle;
    }

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Date getQueTime() {
        return queTime;
    }

    public void setQueTime(Date queTime) {
        this.queTime = queTime;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
