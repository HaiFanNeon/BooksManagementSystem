package com.example.booksmanagementsystem.mapper;


import com.example.booksmanagementsystem.model.Book;
import com.example.booksmanagementsystem.model.PageRequest;
import com.example.booksmanagementsystem.model.PageResult;
import com.example.booksmanagementsystem.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookInfoMapper {
    @Select("select * from book_info")
    public List<Book> getBookList();


    @Select("select count(1) from book_info where status != 0")
    public Integer count();

    @Select("select * from book_info limit #{offset},#{pageSize}")
    public List<Book> getListByPage(@Param("offset") Integer offset,@Param("pageSize") Integer pageSize);

    public Integer addBook(Book book);

}
