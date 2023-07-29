package com.itheima.controller;

import com.itheima.domain.User1;
import com.itheima.domain.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    // POJO参数传递，例如：通过URL发送get请求，该方法能够自动提取URL中的参数并封装成User对象
    // http://localhost/项目名/pojoParam1?name=zmz&age=8
    @RequestMapping("/pojoParam1")
    @ResponseBody
    public String commonParam(User1 user1){
        System.out.println("pojo参数传递 user==>" + user1);
        return "'module': 'pojo param'";
    }

    // 嵌套POJO参数传递，例如：通过URL发送get请求，该方法同样能够自动提取URL中的参数并封装成User对象
    // http://localhost/项目名/pojoParam2?name=zmz&age=8&address.province=anhui&address.city=hefei
    @RequestMapping("/pojoParam2")
    @ResponseBody
    public String commonParam(User2 user2){
        System.out.println("pojo嵌套pojo参数传递 user==>" + user2);
        return "'module': 'pojo include pojo param'";
    }
}