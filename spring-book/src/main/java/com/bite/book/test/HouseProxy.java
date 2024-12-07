package com.bite.book.test;

public class HouseProxy implements HouseSubject{
    //将被代理对象声明为成员变量
    private HouseSubject houseSubject;
    public HouseProxy(HouseSubject houseSubject) {
        this.houseSubject = houseSubject;
    }
    @Override
    public void rentHouse() {
//开始代理
        System.out.println("我是中介, 开始代理");
//代理房东出租房子
        houseSubject.rentHouse();
//代理结束
        System.out.println("我是中介, 代理结束");
    }
    @Override
    public void saleHouse() {
//开始代理
        System.out.println("我是中介, 开始代理");
//代理房东出租房子
        houseSubject.saleHouse();
//代理结束
        System.out.println("我是中介, 代理结束");
    }
}
