package com.fanxl.design.pattern.structural.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description jdk 动态代理
 * @author: fanxl
 * @date: 2020/8/15 0015 11:06
 */
public class IBuyerDynamicProxy implements InvocationHandler {

    private Object target;

    public IBuyerDynamicProxy(Object target) {
        this.target = target;
    }

    public void bind() {
        Class bClass = target.getClass();
        Proxy.newProxyInstance(bClass.getClassLoader(), bClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(target, args);
        after();
        return object;
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }

}
