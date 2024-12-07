package com.bite.book.test;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {
    private Object target;

    public JDKInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在这里可以添加一些额外的逻辑，比如日志记录、权限检查等
        System.out.println("Before method: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After method: " + method.getName());
        return result;
    }
}
