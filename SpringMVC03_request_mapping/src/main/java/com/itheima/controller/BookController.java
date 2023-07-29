package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/book")
public class BookController {
    @RequestMapping("/save")
    // 2.3设置当前路径的返回类型是 把放回内容打包成一个整体返回
    @ResponseBody
    public String save(){
        // 处理请求代码在这里
        System.out.println("user save...");
        return "{'module':'springmvc, /book/save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        // 处理请求代码在这里
        System.out.println("user delete...");
        return "{'module':'springmvc, /book/delete'}";
    }
}
