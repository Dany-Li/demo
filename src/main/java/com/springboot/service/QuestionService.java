package com.springboot.service;
/*
 *@date 2018/8/8  10:22
 */


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.bean.Question;
import com.springboot.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    public List<Question> getAllQuesByIdDesc() {
        return questionMapper.getAllByIdDesc();
    }

    public List<Question> getQuesByType(String type) {
        return questionMapper.selectQuesByType(type);
    }

    /*public PageInfo<Question> getAllQuesByIdDesc(Integer pn,Integer limit) {
        PageHelper.startPage(pn,limit);
        List<Question> questions = questionMapper.getAllByIdDesc();
        return new PageInfo<>(questions);
    }*/
}
