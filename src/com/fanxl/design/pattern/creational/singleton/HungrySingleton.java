package com.fanxl.design.pattern.creational.singleton;

/**
 * @description 饿汉式
 * @author: fanxl
 * @date: 2019/2/16 0016 23:03
 */
public class HungrySingleton {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
