package com.example.booksmanagementsystem.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private Integer count;
    private BigDecimal price;
    private String publish;
    private Integer status; // 1 借阅 2 不可借阅
    private String statusCN;
}
