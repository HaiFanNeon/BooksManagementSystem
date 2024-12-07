package com.bite.book.config;

import com.bite.book.model.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


@ControllerAdvice


    

public class ResponseAdvice implements ResponseBodyAdvice {

    private static ObjectMapper mapper = new ObjectMapper();
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        // 这里可以自定义返回结果
        if (body instanceof String) {
            try {
                return mapper.writeValueAsString(Result.success(body));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return Result.success(body);
    }
}
