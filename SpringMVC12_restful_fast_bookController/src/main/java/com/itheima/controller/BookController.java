package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

// @Controller
// @ResponseBody
@RestController
@RequestMapping("/books")
public class BookController {
    // @RequestMapping(value = "", method = RequestMethod.POST)
    @PostMapping
    // @ResponseBody
    public String save(@RequestBody Book book){
        System.out.println("book save..."+book);
        return "{'module':'book delete'}";
    }

    // @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    // @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("book delete"+id);
        return "{'module':'book delete'}";
    }

    // @RequestMapping(value = "", method = RequestMethod.PUT)
    @PutMapping
    // @ResponseBody
    public String update(@RequestBody Book book){
        System.out.println("book update..."+book);
        return "{'module':'book update'}";
    }

    // @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    // @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("book getById..."+id);
        return "{'module':'book getById'}";
    }

    // @RequestMapping(value = "", method = RequestMethod.GET)
    @GetMapping
    // @ResponseBody
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }

}
