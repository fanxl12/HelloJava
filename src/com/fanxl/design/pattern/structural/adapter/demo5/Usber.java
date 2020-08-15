package com.fanxl.design.pattern.structural.adapter.demo5;


/**
 * @description 目标的具体实现
 * @author: fanxl
 * @date: 2020/8/13 0013 22:20
 */
public class Usber implements Target {

    @Override
    public void isUsb() {
        System.out.println("USB接口");
    }
}
