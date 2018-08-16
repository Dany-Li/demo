package com.springboot.bean;
/*
 *@date 2018/8/8  10:28
 */


import java.util.HashMap;
import java.util.Map;

public class Msg {

    private int code;//100成功--200失败
    private String msg;//处理消息

    private Map<String,Object> extend=new HashMap<String,Object>();

    public static Msg success(){
        Msg result=new Msg();
        result.setCode(100);
        result.setMsg("处理成功!");
        return result;
    }
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }
    public static Msg wrongpwd(){//专门为密码错误设置
        Msg result=new Msg();
        result.setCode(300);
        result.setMsg("密码错误！");
        return result;
    }

    public Msg add(String key,Object value){
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Map<String, Object> getExtend() {
        return extend;
    }
    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
