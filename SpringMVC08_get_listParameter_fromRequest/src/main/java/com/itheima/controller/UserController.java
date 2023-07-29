package com.itheima.controller;

import com.itheima.domain.User1;
import com.itheima.domain.User2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class UserController {
    // 数组参数传递，例如：通过URL发送get请求，该方法能够自动提取URL中的参数并封装成数组对象
    // http://localhost/项目名/pojoParam2?hobbies=football&hobbies=books&hobbies=video games&hobbies=programming
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String commonParam(String[] hobbies){
        System.out.println("数组参数传递 String[]==>" + Arrays.toString(hobbies));
        return "'module': 'array param'";
    }
}