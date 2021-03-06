package com.fanxl.design.pattern.structural.adapter.demo1;

import java.util.UUID;

/**
 * @description 适配器模式 类适配器模式
 * 原理：通过继承来实现适配器功能
 * 把usb 适配成了 ps2
 * @author: fanxl
 * @date: 2020/8/13 0013 22:21
 */
public class Test {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter();
        ps2.isPs2();

        System.out.println(UUID.randomUUID().toString().replace("-", ""));

    }

}
