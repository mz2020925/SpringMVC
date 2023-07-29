package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping()
    public String save(@RequestBody Book book){
        System.out.println("book save "+book);
        return "{'module': 'book save success'}";
    }

    public String delete(){
        return null;
    }

    public String update(){
        return null;
    }

    public String getById(){
        return null;
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll");
        List<Book> arrayList = new ArrayList<>();
        Book book1 = new Book();
        book1.setName("《概率论与数理统计》");
        book1.setType("大学");
        book1.setDescription("学好数理化，走遍天下都不怕");
        arrayList.add(book1);

        Book book2 = new Book();
        book2.setName("《微积分》");
        book2.setType("大学");
        book2.setDescription("数学是科学基础");
        arrayList.add(book2);

        return arrayList;
    }
}
