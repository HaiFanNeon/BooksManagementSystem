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
    public void testSelect() {
        userInfoMapper.selectAll();
    }

    @Test
    public void selectById() {
        UserInfo userInfo = userInfoMapper.selectById(2);
        System.out.println(userInfo.toString());
    }

    @Test
    public void testInsert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("example_username");
        userInfo.setPassword("example_password");
        userInfo.setAge(25);
        userInfo.setGender(1);
        userInfo.setPhone("12345678901");
        Integer insert = userInfoMapper.insert(userInfo);
        System.out.println("新增数据：" + insert + "，数据id：" + userInfo.getId());
    }
    @Test
    public void testDelete() {
        userInfoMapper.delete(2);
    }

    @Test
    public void testUpdate() {
        UserInfo userInfo = userInfoMapper.selectById(2);
        userInfo.setAge(30);
        userInfoMapper.update(userInfo);
    }
}