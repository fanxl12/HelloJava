package com.fanxl.design.pattern.structural.adapter.demo4;

import com.fanxl.design.pattern.structural.adapter.demo1.Usb;

/**
 * @description 把ps2 适配成 usb 目标是 ps2可以插在usb口上使用
 * 此时 Usb是目标角色 Ps2源角色
 * @author: fanxl
 * @date: 2020/8/15 0015 9:21
 */
public class Adapter extends Ps2 implements Usb {

    @Override
    public void isUsb() {
        super.isPs2();
    }
}
