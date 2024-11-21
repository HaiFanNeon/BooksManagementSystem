package com.example.booksmanagementsystem.controller;


import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.model.Book;
import com.example.booksmanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    // 等价
//    private final BookService bookService;
//
//    public BookController(BookService bookService) {
//        this.bookService = bookService;
//    }

    @RequestMapping("/getBookList")
    public List<Book> getBookList() {
        List<Book> bookList = bookService.getBookList();
        return bookList;
    }


}
