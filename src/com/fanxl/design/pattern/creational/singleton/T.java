package com.fanxl.design.pattern.creational.singleton;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/16 0016 15:48
 */
public class T implements Runnable {

    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "--" + lazySingleton);
    }
}
