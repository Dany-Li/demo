package com.springboot.mapper;
/*
 *@date 2018/8/8  11:19
 */


import com.springboot.bean.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  //一定要声明这是一个mapper
public interface QuestionMapper {
    List<Question> getAllByIdDesc();

    List<Question> selectQuesByType(String type);
}
