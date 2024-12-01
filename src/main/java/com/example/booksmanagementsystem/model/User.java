package com.example.booksmanagementsystem.model;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer deleteFlag;
    private Data createTime;
    private Data updateTime;
}
