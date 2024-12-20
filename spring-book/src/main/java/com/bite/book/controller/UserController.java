package com.bite.book.controller;

import com.bite.book.annotation.MyAspect;

import com.bite.book.constant.Constants;
import com.bite.book.model.UserInfo;
import com.bite.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequestMapping("/user")
@RestController
public class UserController {

    @MyAspect
    @RequestMapping("/u1")
    public String u1(){
        return "u1";
    }

    @RequestMapping("/u2")
    public String u2(){
        return "u2";
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Boolean login(String userName, String password, HttpSession session){
        //校验参数
        if (!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)){
            return false;
        }
        //验证账号密码是否正确
        /**
         * if (userName.equals("admin")){ }  这种写法, 如果userName为null, 会报空指针异常
         * 开发习惯, 养成
         */
        //1. 根据用户名去查找用户信息
        UserInfo userInfo = userService.getUserInfoByName(userName);
        //2. 比对密码是否正确
        if (userInfo==null || userInfo.getId()<=0){
            return false;
        }
        if (password.equals(userInfo.getPassword())){
            //账号密码正确
            //存Session
            userInfo.setPassword("");
            session.setAttribute(Constants.SESSION_USER_KEY,userInfo);
            return true;
        }

        return false;

    }
}
