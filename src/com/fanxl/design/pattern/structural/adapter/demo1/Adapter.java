package com.fanxl.design.pattern.structural.adapter.demo1;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/13 0013 22:20
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }
}
