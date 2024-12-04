package com.bite.book.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspectDemo {

    @Pointcut("@annotation(com.bite.book.annotation.MyAspect)")
    public void pt() {}

    @Before("pt()")
    public void before(){
        log.info("MyAspect -> before");
    }

    @After("pt()")
    public void after(){
        log.info("MyAspect -> after");
    }
}
