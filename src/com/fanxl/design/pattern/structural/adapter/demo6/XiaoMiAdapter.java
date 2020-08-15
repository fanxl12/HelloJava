package com.fanxl.design.pattern.structural.adapter.demo6;

/**
 * @description 小米手机充电器
 * @author: fanxl
 * @date: 2020/8/15 0015 9:56
 */
public class XiaoMiAdapter extends AC220 implements DC5 {
    @Override
    public int getDc5() {
        int ac = super.out220();
        return ac / 44;
    }
}
