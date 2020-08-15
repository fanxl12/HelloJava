package com.fanxl.design.pattern.structural.adapter.demo6;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 10:01
 */
public class HuaWeiAdapter implements DC5 {

    private AC220 ac220;

    public HuaWeiAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int getDc5() {
        int ac = ac220.out220();
        return ac / 44;
    }
}
