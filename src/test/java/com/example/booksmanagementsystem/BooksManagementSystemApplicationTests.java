package com.example.booksmanagementsystem;

import com.example.booksmanagementsystem.mapper.UserInfoMapper;
import com.example.booksmanagementsystem.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BooksManagementSystemApplicationTests {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void testUserInfoMapper() {
        List<UserInfo> userInfos = userInfoMapper.selectAll("desc");
        userInfos.forEach(System.out::println);
    }
    @Test
    void contextLoads() {
    }

}
