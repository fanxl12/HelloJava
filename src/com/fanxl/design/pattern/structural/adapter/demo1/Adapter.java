package com.fanxl.design.pattern.structural.adapter.demo1;

/**
 * @description 适配器角色
 * 继承的角色是被适配者，实现的是目标角色
 * @author: fanxl
 * @date: 2020/8/13 0013 22:20
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        // 适配工作...
        super.isUsb();
    }
}
