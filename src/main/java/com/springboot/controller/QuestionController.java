package com.springboot.controller;
/*
 *@date 2018/8/8  10:21
 */


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.bean.Msg;
import com.springboot.bean.Question;
import com.springboot.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@Controller
//@ComponentScan(basePackages = {"com.springboot.service"})  //扫描service层
public class QuestionController {

    @Autowired
    private QuestionService questionService;


   /* @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/

    /**
     *倒序查询question表中所有的问题
     * @return
     */
    /*@GetMapping("/")
    //@ResponseBody
    public String getAllQuesByIdDesc(@RequestParam(value = "pn",defaultValue = "1") Integer pn,
                                  @RequestParam(value = "limit",defaultValue = "5")Integer limit,
                                  HttpServletRequest request){

        PageInfo<Question> questions = questionService.getAllQuesByIdDesc(pn,limit);
        request.setAttribute("questions",questions);
        return "index";

    }*/


    /**
     * 按问题ID倒序查询question表中的所有的问题
     * @param pn
     * @return
     */
    @GetMapping("/getAll")
    @ResponseBody
    public Msg getAllQuesByIdDesc(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        PageHelper.startPage(pn,10);
        List<Question> questions = questionService.getAllQuesByIdDesc();

        PageInfo page = new PageInfo(questions,5);// 连续传入5页

        return Msg.success().add("pageInfo",page);

    }






    /*@GetMapping("/getAll")
    public String getAllQuesByIdDesc(Model model){

        List<Question> questions = questionService.getAllQuesByIdDesc();
//        model.addAttribute("ques",questions);
        model.addAttribute("ques",questions);

        return "index";

    }*/


    /**
     * 根据问题类型查询问题记录，问题ID倒序
     */
    @RequestMapping("/quesbytype")
    @ResponseBody
    public Msg selectQuesByType(@RequestParam(value = "pn",defaultValue = "1") Integer pn,@RequestParam(value = "type") String type){
        PageHelper.startPage(pn,5);
        List<Question> ques = questionService.getQuesByType(type);
        PageInfo page = new PageInfo(ques,5);
        return Msg.success().add("pageInfo",page);
    }


}
