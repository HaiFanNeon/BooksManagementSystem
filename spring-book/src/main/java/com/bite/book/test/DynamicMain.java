package com.bite.book.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import com.bite.book.test.JDKInvocationHandler;



public class DynamicMain {
    public static void main(String[] args) {
        HouseSubject target = new RealHouseSubject();

        InvocationHandler handler = new JDKInvocationHandler(target);

        // JDKInvocationHandler 实例化时不需要强制类型转换
        HouseSubject proxy = (HouseSubject) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                new Class<?>[] {HouseSubject.class},
               handler
        );

        proxy.rentHouse();
    }
}