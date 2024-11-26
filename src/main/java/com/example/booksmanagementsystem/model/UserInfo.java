package com.example.booksmanagementsystem.model;


import lombok.Data;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Data
public class UserInfo {
//`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
//`username` VARCHAR ( 127 ) NOT NULL,
//`password` VARCHAR ( 127 ) NOT NULL,
//`age` TINYINT ( 4 ) NOT NULL,
//`gender` TINYINT ( 4 ) DEFAULT '0' COMMENT '1-男 2-女 0-默认',
//`phone` VARCHAR ( 15 ) DEFAULT NULL,
//`delete_flag` TINYINT ( 4 ) DEFAULT 0 COMMENT '0-正常, 1-删除',
//`create_time` DATETIME DEFAULT now(),
//`update_time` DATETIME DEFAULT now(),
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
    private String phone;
    private Integer deleteFlag;
    private String createTime;
    private String updateTime;

}
