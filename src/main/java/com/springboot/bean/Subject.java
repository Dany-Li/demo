package com.springboot.bean;
/*
 *@date 2018/8/6  20:13
 */


/**
 * 科目
 */
public class Subject {

    private Integer subId;
    private String subjectName;   //科目名
    private String type;     //科目里具体的类别


    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
