package com.fanxl.design.pattern.structural.proxy.demo2;

import com.fanxl.design.pattern.structural.proxy.demo1.Buyer;
import com.fanxl.design.pattern.structural.proxy.demo1.IBuyer;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Desc cglib动态代理
 * @Author xlfan10
 */
public class Main1 {

    public static void main(String[] args) {
        String name = "fanxl";
        Ticketer buyer = new Ticketer(name);
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置代理对象的父类
        enhancer.setSuperclass(buyer.getClass());
        // 设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object obj;
                // 这里我们在 bugTicket 操作前后进行通知操作，来模拟 BuyerProxy
                if ("bugTicket".equals(method.getName())) {
                    System.out.println("准备定时任务，开始刷票");
                    obj = method.invoke(buyer, args);
                    System.out.println("刷票成功，短信通知客户");
                } else {
                    obj = method.invoke(buyer, objects);
                }
                return obj;
            }
        });
        // 创建子类（代理对象）
        Ticketer ticketerProxy = (Ticketer)enhancer.create();
        ticketerProxy.login(name, "123456");
        ticketerProxy.bugTicket();
    }

}
