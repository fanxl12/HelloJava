package com.fanxl.design.pattern.structural.flyweight.demo1;

import java.util.HashMap;

/**
 * @description 享元工厂 维护共享的角色
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class FlyweightFactory {

    // 池容器
    private static HashMap<String, Subject> pool = new HashMap<>();

    // 获取池中对象
    public static Subject getFlyweight(String extrinsic) {
        // 需要返回的对象
        Subject flyweight = null;
        if (!pool.containsKey(extrinsic)) {
            // 根据外部状态创建享元对象
            flyweight = new ConcreteSubject(extrinsic);
            // 再放入池中
            pool.put(extrinsic, flyweight);
        } else {
            // 池中有对象，则直接返回
            flyweight = pool.get(extrinsic);
        }
        return flyweight;
    }

}
