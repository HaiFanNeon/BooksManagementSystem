package com.bite.book.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
@Order(2)
public class AspectDemo4 {
    @Pointcut("execution(* com.bite.book.controller.*.*(..))")
    private void pt(){}
    //前置通知
    @Before("pt()")
    public void doBefore() {
        log.info("执行 AspectDemo4 -> Before 方法");
    }
    //后置通知
    @After("pt()")
    public void doAfter() {
        log.info("执行 AspectDemo4 -> After 方法");
    }
}
