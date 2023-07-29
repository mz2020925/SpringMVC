package com.itheima.controller;

import com.itheima.domain.User1;
import com.itheima.domain.User2;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    // 1.日期字符串参数传递封装成标准日期字符串
    // yyyy/MM/dd是默认形式
    @RequestMapping("/dateParam")
    @ResponseBody
    public String listParamForJson(Date date){
        System.out.println("date param ==>" + date);
        return "{'module': 'date param'}";
    }

    // 2.几个不同形式日期字符串参数传递分别封装成标准日期字符串
    @RequestMapping("/diffDateParam")
    @ResponseBody
    public String moreDateParam(@DateTimeFormat(pattern = "yyyy/MM/dd") Date date1,
                                @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2,
                                @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date3){
        System.out.println("date param ==>" + date1);
        System.out.println("date param(yyyy-MM-dd) ==>" + date2);
        System.out.println("date param(yyyy-MM-dd HH:mm:ss) ==>" + date3);
        return "{'module': 'date param'}";
    }

}