package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    // 如果url中的参数键和下面方法中的形参名称不一样，则需要用@RequestParam("name") String username才能进行正确匹配
    public String commonParam(@RequestParam("name") String username, @RequestParam("age") int age){
        // 可以自动从Get请求的URl中获取数据，或者从Post请求的请求体中获取参数，线面代码对两种请求方式是通用的
        // 不用再像以前的Servlet那样写两个Servlet分别处理Get请求和Post请求
        System.out.println("普通英文参数传递==>" + username);
        System.out.println("普通英文参数传递==>" + age);
        return "{'module' : 'common param'}";
        // 在Postman中输入http://localhost/项目名/commonParam?name=zmz&age=9 测试Get请求
        // 在Postman中输入http://localhost/项目名/commonParam 并在请求体中设置name=zmz，age=9 测试Post请求

    }


}