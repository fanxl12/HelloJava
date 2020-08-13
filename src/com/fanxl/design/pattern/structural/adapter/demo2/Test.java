package com.fanxl.design.pattern.structural.adapter.demo2;

import com.fanxl.design.pattern.structural.adapter.demo1.Ps2;
import com.fanxl.design.pattern.structural.adapter.demo1.Usber;

/**
 * @description 适配器模式 对象适配器模式
 * 通过组合来实现适配器功能
 * @author: fanxl
 * @date: 2020/8/13 0013 22:25
 */
public class Test {

    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
