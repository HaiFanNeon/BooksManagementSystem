package com.example.booksmanagementsystem.config;

import com.example.booksmanagementsystem.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    //自定义的拦截器对象
    @Autowired
    private LoginInterceptor loginInterceptor;

    private List<String> excludePaths = Arrays.asList(
            "/user/login",
            "/**/*.js",
            "/**/*.css",
            "/**/*.png",
            "/**/*.html"
    );

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//注册自定义拦截器对象



        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")//设置拦截器拦截的请求路径（ /** 表示拦截所有请求）
                .excludePathPatterns(excludePaths);


    }
}