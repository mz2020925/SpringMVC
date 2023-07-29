package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age){
        // 可以自动从Get请求的URl中获取数据，或者从Post请求的请求体中获取参数，线面代码对两种请求方式是通用的
        // 不用再像以前的Servlet那样写两个Servlet分别处理Get请求和Post请求
        System.out.println("普通英文参数传递==>"+name);
        System.out.println("普通英文参数传递==>"+age);
        return "{'module' : 'common param'}";
    }


}