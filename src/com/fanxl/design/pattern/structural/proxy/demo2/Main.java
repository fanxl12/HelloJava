package com.fanxl.design.pattern.structural.proxy.demo2;

import com.fanxl.design.pattern.structural.proxy.demo1.Buyer;
import com.fanxl.design.pattern.structural.proxy.demo1.IBuyer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Desc jdk动态代理， 代理类需要实现抽象接口
 * @Author xlfan10
 */
public class Main {

    public static void main(String[] args) {
        String name = "fanxl";
        IBuyer buyer = new Buyer(name);
        IBuyer proxy = (IBuyer)Proxy.newProxyInstance(buyer.getClass().getClassLoader(), buyer.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj;
                // 这里我们在bugTicket操作前后添加通知操作，模拟代理
                if ("bugTicket".equals(method.getName())) {
                    System.out.println("准备定时任务，开始刷票");
                    obj = method.invoke(buyer, args);
                    System.out.println("刷票成功，通知客户");
                } else {
                    obj = method.invoke(buyer, args);
                }
                return obj;
            }
        });
        proxy.login("fanxl", "123456");
        proxy.bugTicket();
    }

}
