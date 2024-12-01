package com.example.booksmanagementsystem.service;

import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.mapper.BookInfoMapper;
import com.example.booksmanagementsystem.model.Book;
import com.example.booksmanagementsystem.model.PageRequest;
import com.example.booksmanagementsystem.model.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookInfoMapper bookInfoMapper;

    public List<Book> getBookList() {
        return bookInfoMapper.getBookList();
    }

    public Integer count() {
        Integer count = bookInfoMapper.count();
        return count;
    }

    public List<Book> getListByPage(PageRequest pageRequest) {
        return bookInfoMapper.getListByPage(pageRequest.getOffset(), pageRequest.getPageSize());
    }
}
