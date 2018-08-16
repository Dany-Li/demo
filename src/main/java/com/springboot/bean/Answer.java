package com.springboot.bean;
/*
 *@date 2018/8/6  20:02
 */


import java.util.Date;


/**
 * 回答表
 */
public class Answer {

    private Integer ansId;      //回答的ID
    private String ansContent;     //回答的内容
    private Integer replierId;     //回答者的ID
    private Date replyTime;    //回答时间
    private Integer qId;     //问题的ID


    public Integer getAnsId() {
        return ansId;
    }

    public void setAnsId(Integer ansId) {
        this.ansId = ansId;
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent;
    }

    public Integer getReplierId() {
        return replierId;
    }

    public void setReplierId(Integer replierId) {
        this.replierId = replierId;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }
}
