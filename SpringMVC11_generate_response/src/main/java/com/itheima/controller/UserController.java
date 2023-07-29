package com.itheima.controller;

import com.itheima.domain.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    // 响应页面，跳转页面
    @RequestMapping("/toJumpIndex")
    public String toJumpIndex() {
        System.out.println("跳转页面");
        return "index.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response text";
    }

    // 响应一个对象，会被转换为json数据通过HTTP传给浏览器，自动完成该转换操作的是pom文件中导入的jackson包,
    // 这个包里含有MappingJackson2HttpMessageConverter.java实现类
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User1 toJsonPojo() {
        System.out.println("返回json形式表示的对象");
        User1 user1 = new User1();
        user1.setName("zmz");
        user1.setAge(100);
        return user1;
    }

    // 响应一个对象集合，依然会被转换为json数据通过HTTP传给浏览器
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User1> toJsonList() {
        System.out.println("返回一个集合里面包含几个json形式的对象");
        ArrayList<User1> user1s = new ArrayList<>();

        User1 user1 = new User1();
        user1.setName("zmz");
        user1.setAge(100);

        User1 user1_2 = new User1();
        user1_2.setName("zzz");
        user1_2.setAge(34);

        user1s.add(user1);
        user1s.add(user1_2);

        return user1s;
    }

}