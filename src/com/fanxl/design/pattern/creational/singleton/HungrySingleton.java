package com.fanxl.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @description 饿汉式
 * @author: fanxl
 * @date: 2019/2/16 0016 23:03
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

}
