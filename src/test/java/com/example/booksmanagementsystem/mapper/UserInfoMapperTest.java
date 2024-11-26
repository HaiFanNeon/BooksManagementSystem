package com.example.booksmanagementsystem.mapper;

import com.example.booksmanagementsystem.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void selectById() {
        UserInfo userInfo = userInfoMapper.selectById(2);
        System.out.println(userInfo.toString());
    }

    @Test
    public testInsert() {
        UserInfo userInfo = UserInfo.builder()
                .username("test")
                .password("123456")
                .build();
    }
}