package com.example.booksmanagementsystem.service;

import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.model.Book;

import java.util.List;

public class BookService {
    private BookDao bookDao = new BookDao();
    public List<Book> getBookList() {
        List<Book> bookInfos = bookDao.mockData();
        for (Book book : bookInfos) {
            book.setStatusCN(book.getStatus() == 1 ? "可借阅" : "不可借阅");
        }
        return bookInfos;
    }
}
