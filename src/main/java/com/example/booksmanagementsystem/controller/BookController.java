package com.example.booksmanagementsystem.controller;


import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.model.Book;
import com.example.booksmanagementsystem.model.PageRequest;
import com.example.booksmanagementsystem.model.PageResult;
import com.example.booksmanagementsystem.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Slf4j
@RequestMapping("book")
@RestController
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/getBookList")
    public List<Book> getBookList() {
        return bookService.getBookList();
    }

    @RequestMapping("/getListByPage")
    public PageResult<Book> getListByPage(PageRequest pageRequest) {
        Integer count = bookService.count();
        List<Book> listByPage = bookService.getListByPage(pageRequest);


        return new PageResult<>(count, listByPage, pageRequest);
    }

    @RequestMapping("/addBook")
    public Boolean addBook(Book book) {
        log.info(book.toString());
        return bookService.addBook(book) == 1;
    }
}
