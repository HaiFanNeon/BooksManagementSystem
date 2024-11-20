package com.example.booksmanagementsystem.controller;


import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.model.Book;
import com.example.booksmanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequestMapping("/book")
@RestController
public class BookController {
    private BookService bookService = new BookService();
    @RequestMapping("/getBookList")
    public List<Book> getBookList() {
        List<Book> bookList = bookService.getBookList();
        return bookList;
    }


}
