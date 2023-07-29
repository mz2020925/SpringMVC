package com.itheima.controller;

import com.itheima.domain.User1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "'module': 'user save'";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete by id..." + id);
        return "'module': 'user delete'";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@PathVariable User1 user1){
        System.out.println("user update ..."+user1);
        return "'module': 'user update'";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable  Integer id){
        System.out.println("user getById..." + id);
        return "{'module':'user getById'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("get all...");
        return "'module':'user getAll'";
    }


}