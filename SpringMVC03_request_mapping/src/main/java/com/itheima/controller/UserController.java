package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1.定义Controller，相当于以前定义一个Servlet
// 2.1使用Controller定义Bean，以前是使用Component定义Bean
@Controller
@RequestMapping("/user")  // 把注解加载类前面的"/user"是访问路径的前缀
public class UserController {
    // 2.2设置当前操作的请求路径
    @RequestMapping("/save")
    // 2.3设置当前路径的返回类型是 把放回内容打包成一个整体返回
    @ResponseBody
    public String save(){
        // 处理请求代码在这里
        System.out.println("user save...");
        return "{'module':'springmvc, /user/save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        // 处理请求代码在这里
        System.out.println("user delete...");
        return "{'module':'springmvc, /user/save'}";
    }

}
// 3.在config包里面创建springMVC的配置文件，加载controller对应的Bean