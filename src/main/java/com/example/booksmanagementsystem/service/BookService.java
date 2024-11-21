package com.example.booksmanagementsystem.service;

import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookService {
    @Autowired
    private BookDao bookDao;
    public List<Book> getBookList() {
        List<Book> bookInfos = bookDao.mockData();
        for (Book book : bookInfos) {
            book.setStatusCN(book.getStatus() == 1 ? "可借阅" : "不可借阅");
        }
        return bookInfos;
    }
}
