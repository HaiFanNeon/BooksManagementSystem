package com.bite.book.controller;

import com.bite.book.annotation.MyAspect;
import com.bite.book.model.BookInfo;
import com.bite.book.model.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/test")
@RestController
public class TestController {
    @MyAspect
    @RequestMapping("/t1")
    public String t1() {
        return "t1";
    }

    @MyAspect
    @RequestMapping("/t2")
    public boolean t2() {
        int a = 10 / 0;
        return true;
    }
}

