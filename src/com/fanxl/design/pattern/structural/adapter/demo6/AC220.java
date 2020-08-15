package com.fanxl.design.pattern.structural.adapter.demo6;

/**
 * @description 被适配的 源角色 （被适配 Adaptee ）
 * @author: fanxl
 * @date: 2020/8/15 0015 9:53
 */
public class AC220 {

    public int out220() {
        int outPut = 220;
        System.out.println("输出220V交流电");
        return outPut;
    }

}
