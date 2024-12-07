package com.bite.book.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@Order(3)
public class AspectDemo3 {
    @Pointcut("execution(* com.bite.book.controller.*.*(..))")
    private void pt(){}
    //前置通知
    @Before("pt()")
    public void doBefore() {
        log.info("执行 AspectDemo3 -> Before 方法");
    }
    //后置通知
    @After("pt()")
    public void doAfter() {
        log.info("执行 AspectDemo3 -> After 方法");
    }
}