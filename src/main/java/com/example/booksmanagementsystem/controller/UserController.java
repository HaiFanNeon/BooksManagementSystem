package com.example.booksmanagementsystem.controller;


import com.example.booksmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
    private UserService userService;

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
        boolean login = userService.login(userName, password);
        if (login) {
            session.setAttribute("userName", userName);
            return true;
        }


        return false;
    }
}
