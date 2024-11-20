package com.example.booksmanagementsystem.controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Boolean login(String userName, String password, HttpSession session) {
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return false;
        }
        // 验证账号和密码
        if ("admin".equals(userName) && "admin".equals(password)) {
            return true;
        }

        return false;
    }
}
