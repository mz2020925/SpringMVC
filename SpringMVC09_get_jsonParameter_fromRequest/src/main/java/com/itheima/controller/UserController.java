package com.itheima.controller;

import com.itheima.domain.User1;
import com.itheima.domain.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    // 1.json参数传递封装成集合，例如：通过发送post请求，该方法能够自动提取json数据并封装成集合
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> hobbies){
        System.out.println("list common for json param ==>" + hobbies);
        return "{'module': 'list common for json param'}";
    }

    // 2.json参数传递封装成pojo，例如：通过发送post请求，该方法能够自动提取json数据并封装成pojo
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(User1 user1){
        System.out.println("pojo common for json param ==>" + user1);
        return "{'module': 'pojo common for json param'}";
    }

    // 3.json参数传递封装成pojo的集合，例如：通过发送post请求，该方法能够自动提取json数据并封装成pojo
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User1> user1List){
        System.out.println("listPojo common for json param ==>" + user1List);
        return "{'module': 'listPojo common for json param'}";
    }
}