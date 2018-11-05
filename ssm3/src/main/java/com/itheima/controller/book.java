package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class book {
    @Autowired
    private BookService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Book> bookList = service.findAll();
        for (Book book : bookList) {
            System.out.println(book);
        }
        model.addAttribute("bookList",bookList);
        return "success";
    }
}
