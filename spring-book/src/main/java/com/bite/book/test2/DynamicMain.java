package com.bite.book.test2;

import com.bite.book.test.HouseSubject;
import com.bite.book.test.RealHouseSubject;
import org.springframework.cglib.proxy.Enhancer;


public class DynamicMain {
    public static void main(String[] args) {
        HouseSubject target= new RealHouseSubject();
        HouseSubject proxy= (HouseSubject) Enhancer.create(target.getClass(), new CGLIBInterceptor(target));
        proxy.rentHouse();
    }
}
