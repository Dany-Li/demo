package com.springboot.controller;
/*
 *@date 2018/8/13  10:13
 */


import com.springboot.bean.Msg;
import com.springboot.bean.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.springboot.constant.PageConstant.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //用户登录
   /* @RequestMapping("/login")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password, HttpSession session){
        User user = userService.searchByUserName(username);
        if (username != null){
            String pwd = user.getPassword();
            if (pwd.equals(password)){
                session.setAttribute("userInfo",user);
            }
        }
        return "ceshi";
    }*/


    //验证用户登录
    /*@GetMapping("/checklogin")
    @ResponseBody
    public Msg checkuserLogin(User user){
        boolean b = userService.checkUser(user.getUserName());
        if (!b){ //如果用户名存在
            //获取用户信息
            User user1 = userService.searchByUserName(user.getUserName());//根用户名查找记录
            String userPwd = user1.getPassword();//获取用户数据库中的密码
            if (userPwd.equals(user.getPassword())){//密码匹配
                return Msg.success().add("userInfo",user1);
            }else {
                return Msg.wrongpwd();//密码错误
            }
        }else {
            return Msg.fail();//用户不存在
        }
    }*/



    //用户登录
    /*@RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(HttpServletRequest request,HttpSession session){
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        String user = userService.login(username,password);
        session.setAttribute("userInfo",user);
        if(user == null){
            return "redirect:/login";
        }else {
            return "redirect:/ceshi";
        }
    }*/






    //验证用户登录
    /*@RequestMapping(value = "/checklogin",method = RequestMethod.GET)
    @ResponseBody
    public Msg checkuserLogin(User user){
        //用户名是否存在
        boolean b = userService.checkUser(user.getUserName());
        if (!b){ //如果用户名存在
            //获取用户信息
            User user1 = userService.searchByUserName(user.getUserName());//根据用户名查找记录
            String userPwd = user1.getPassword();//获取用户数据库中的密码
            if (userPwd.equals(user.getPassword())){ //如果密码匹配
                return Msg.success().add("userInfo",user1);
            }else {
                return Msg.wrongpwd();//密码错误
            }
        }else {
            return Msg.fail();//用户不存在
        }
    }*/





    //验证用户登录
    /*@GetMapping("/checklogin")
    @ResponseBody
    public Msg checkuserLogin(User user0){
        User user1 = userService.searchByUserName(user0.getUserName());
        if (null != user1){//如果用户名存在
            String password = user1.getPassword();//获取用户数据库中的密码
            if (password.equals(user0.getPassword())){//如果密码匹配
                return Msg.success().add("userInfo",user0);
            }else {
                return Msg.wrongpwd();//密码错误
            }
        }else {
            return Msg.fail();//用户名不存在
        }
    }*/




    //用户登录
    /*public String userlogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session){
        User user = userService.searchByUserName(username);
        String pwd = user.getPassword();
        if (pwd.equals(password)){
            session.setAttribute("user",user);
            return INDEX;
        }else {
            return LOGIN;
        }
    }*/




    //进入登录页面
    @RequestMapping("/toLogin")
    public String loginIndex(){
        return LOGIN;
    }



    //用户登录
    @RequestMapping("/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        HttpServletRequest request,RedirectAttributes attributes){
        //判断用户名是否为空
        boolean checkName = (null == username || "".equals(username));
        //判断密码是否为空
        boolean checkPassword = (null == password || "".equals(password));
        if(checkName || checkPassword){
            attributes.addFlashAttribute("nullNameAndPassword","用户名或密码不能为空");
            return REDIRECT;
        }
        //在数据库中查找
        User user = userService.getUser(username,password);
        if (null == user){
            attributes.addFlashAttribute("message","用户名或密码错误");
            return REDIRECT;
        }

        //放入请求域中
        request.setAttribute("user",user);
        return INDEX;

    }




    //进入注册页面
    @RequestMapping("/toRegister")
    public String insert(){
        return REGISTER;
    }




    //用户注册
    @RequestMapping("/register")
    public String save(User user, RedirectAttributes attributes){
        //获取用户名
        String username = user.getUserName();
        User user1 = userService.getUserName(username);
        if (null != user1){
            attributes.addFlashAttribute("mess","用户名已经被注册了");
            return REDIRECTTO;   //返回注册页面
        }

        //如果没有被注册，就进行注册
        userService.save(user);
        return SUCCESS;  //注册成功
    }

}
