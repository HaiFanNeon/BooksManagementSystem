package com.example.booksmanagementsystem.service;

import com.example.booksmanagementsystem.dao.BookDao;
import com.example.booksmanagementsystem.enums.BookStatusEnum;
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
        List<Book> listByPage = bookInfoMapper.getListByPage(pageRequest.getOffset(), pageRequest.getPageSize());

        if (listByPage != null && listByPage.size() > 0) {
            for (Book book : listByPage) {
                book.setStatusCN(BookStatusEnum.getNameByCode(book.getStatus()).getName());
            }
        }

        return listByPage;
    }

    public Integer addBook(Book book) {
        return bookInfoMapper.addBook(book);
    }
}
