package com.example.booksmanagementsystem.dao;

import com.example.booksmanagementsystem.model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookDao {
    public List<Book> mockData() {
        List<Book> bookInfos = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Book book = new Book();
            book.setId(i);
            book.setBookName("Java编程思想");
            book.setAuthor("Bruce Eckel");
            book.setCount(new Random().nextInt(200));
            book.setPrice(new BigDecimal(new Random().nextInt(100)));
            book.setPublish("机械工业出版社" + i);
            book.setStatus(i % 5 == 0 ? 2 : 1);
            bookInfos.add(book);
        }
        return bookInfos;
    }
}
