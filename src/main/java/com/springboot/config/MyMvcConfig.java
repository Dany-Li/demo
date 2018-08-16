package com.springboot.config;
/*
 *@date 2018/8/9  13:19
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * 使用WebMvcConfigurerAdapter可以扩展SpringMvc的功能
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    //所有的WebMvcConfigurerAdapter都会一起起作用
    @Bean   //将组件注册在容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

            //添加视图映射
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                //设置默认访问index.html页面
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("index");
            }
        };
        return adapter;
    }
}
