package com.example.booksmanagementsystem.mapper;

import com.example.booksmanagementsystem.model.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;




    @Test
    void queryByName() {
        List<UserInfo> userInfos = userInfoMapper.queryByName("' or 2='2");
        System.out.println(userInfos);
    }
    @Test
    public void testSelect() {
        userInfoMapper.queryAllUserByLike("z");
    }

    @Test
    public void selectById() {
        UserInfo userInfo = userInfoMapper.selectById(2);
        System.out.println(userInfo.toString());
    }

    @Test
    public void testInsert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("set");
        userInfo.setPassword("set");
        userInfo.setAge(25);

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