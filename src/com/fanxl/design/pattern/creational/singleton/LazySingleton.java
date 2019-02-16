package com.fanxl.design.pattern.creational.singleton;

/**
 * @description 懒汉式
 * @author: fanxl
 * @date: 2019/2/16 0016 15:45
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
