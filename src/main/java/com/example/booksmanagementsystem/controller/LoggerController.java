package com.example.booksmanagementsystem.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class LoggerController {

    private static Logger logger = LoggerFactory.getLogger(LoggerController.class);


    @PostConstruct
    public void print() {
        logger.info("打印日志");
        logger.error("打印日志");
        logger.warn("打印日志");
        logger.debug("打印日志");
        logger.trace("打印日志");
    }
}
