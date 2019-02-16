package com.fanxl.design.pattern.creational.singleton;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/16 0016 15:48
 */
public class Test {

    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program run end");
    }

}
