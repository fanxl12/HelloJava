package com.fanxl.design.pattern.structural.adapter.demo5;

/**
 * @description 对象适配器（使用委托）
 * @author: fanxl
 * @date: 2020/8/13 0013 22:24
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void isUsb() {
        adaptee.isPs2();
    }
}
