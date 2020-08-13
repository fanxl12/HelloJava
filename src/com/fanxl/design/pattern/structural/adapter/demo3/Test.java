package com.fanxl.design.pattern.structural.adapter.demo3;

/**
 * @description 适配器模式 接口适配器模式
 * 原理：通过抽象类来实现适配，这种适配稍别于上面所述的适配
 * @author: fanxl
 * @date: 2020/8/13 0013 22:27
 */
public class Test {

    public static void main(String[] args) {
        A a = new Ashili();
        a.a();
        a.d();
    }
}
