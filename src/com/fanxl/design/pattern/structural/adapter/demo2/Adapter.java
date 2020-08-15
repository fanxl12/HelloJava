package com.fanxl.design.pattern.structural.adapter.demo2;

import com.fanxl.design.pattern.structural.adapter.demo1.Ps2;
import com.fanxl.design.pattern.structural.adapter.demo1.Usb;

/**
 * @description 对象适配器（使用委托）
 * @author: fanxl
 * @date: 2020/8/13 0013 22:24
 */
public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
