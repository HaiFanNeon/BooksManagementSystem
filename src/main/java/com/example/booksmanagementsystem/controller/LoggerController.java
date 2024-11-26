package com.example.booksmanagementsystem.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;


@Slf4j
@RestController
public class LoggerController {



    @PostConstruct
    public void print() {
        log.info("打印日志");
        log.error("打印日志");
        log.warn("打印日志");
        log.debug("打印日志");
    }
}
