package com.bite.book.config;


import com.bite.book.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class ErrorHandle {
    //全局异常处理
    @ExceptionHandler
    public Object handler(Exception e) {
        return Result.fail(e.getMessage());
    }
}
