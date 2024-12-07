package com.bite.book.test2;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
public class CGLIBInterceptor implements MethodInterceptor {
    //目标对象, 即被代理对象
    private Object target;
    public CGLIBInterceptor(Object target){
        this.target = target;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
// 代理增强内容
        System.out.println("我是中介, 开始代理");
//通过反射调用被代理类的方法
        Object retVal = methodProxy.invoke(target, objects);
//代理增强内容
        System.out.println("我是中介, 代理结束");
        return retVal;
    }
}