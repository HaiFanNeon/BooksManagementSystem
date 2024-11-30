package com.example.booksmanagementsystem.mapper;

import com.example.booksmanagementsystem.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j

@SpringBootTest
class UserInfo2MapperTest {

    @Autowired
    private UserInfo2Mapper userInfo2Mapper;

    @Test
    public void insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("set1");
        userInfo.setPassword("set1");
        userInfo.setAge(25);
        userInfo.setPhone("123456789");

        Integer insert = userInfo2Mapper.insert(userInfo);
        System.out.println("新增数据：" + insert + "，数据id：" + userInfo.getId());

    }

//    @Test
//    public void select() {
//        List<UserInfo> userInfos = userInfo2Mapper.selectByCondition("s", 10, 1);
//        log.info("userInfos:{}", userInfos.toString());
//
//    }

    @Test
    public void update() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(3);
        userInfo.setUsername("update1");
        userInfo.setPassword("update1");
        userInfo.setAge(25);
        userInfo.setPhone("123456789");
        Integer update = userInfo2Mapper.update(userInfo);
    }

    @Test
    public void delete() {
        Integer delete = userInfo2Mapper.delete(Arrays.asList(2, 3, 4));

    }

    @Test
    public void select() {
        List<UserInfo> select = userInfo2Mapper.select();
        log.info("select:{}", select.toString());
    }
}