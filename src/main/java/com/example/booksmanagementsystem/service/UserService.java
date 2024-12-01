package com.example.booksmanagementsystem.service;


import com.example.booksmanagementsystem.mapper.UserInfoMapper;
import com.example.booksmanagementsystem.model.UserInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {
    private final UserInfoMapper userInfoMapper;

    public UserService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public boolean login(String username, String password) {
        UserInfo userInfo = userInfoMapper.queryByName(username);
        if (userInfo == null) {
            return false;
        }
        if (userInfo.getUsername().equals(username) && userInfo.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

}
