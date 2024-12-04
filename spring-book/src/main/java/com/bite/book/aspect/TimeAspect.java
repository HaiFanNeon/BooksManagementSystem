package com.bite.book.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
//@Aspect
//@Component
public class TimeAspect {

    @Pointcut("execution(* com.bite.book.controller.*.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void doBefore() {
        log.info("方法执行前 --- bofore ");
    }

    @After("pointCut()")
    public void doAfter() {
        log.info("方法执行后 --- After");
    }

    @AfterReturning("pointCut()")
    public void doAfterReturning() {
        log.info("方法执行后，返回结果 --- AfterReturning");
    }

    @AfterThrowing("pointCut()")
    public void doAfterThrowing() {
        log.info("方法执行后，抛出异常 --- AfterThrowing");
    }

    @Around("pointCut()")
    public Object timeAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("方法执行前 --- Around");
        Object result = joinPoint.proceed();
        log.info("方法执行后，返回结果 --- Around");
        return result;
    }
}
