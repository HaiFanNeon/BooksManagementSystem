package com.bite.book.test;

public class StaticMain {
    public static void main(String[] args) {
        HouseSubject subject = new RealHouseSubject();
        HouseProxy proxy = new HouseProxy(subject);

        proxy.rentHouse();
    }
}
