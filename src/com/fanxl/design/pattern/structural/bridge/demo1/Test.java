package com.fanxl.design.pattern.structural.bridge.demo1;

/**
 * @description 桥接模式 案例1
 * @author: fanxl
 * @date: 2020/8/13 0013 21:53
 */
public class Test {

    public static void main(String[] args) {
        MobilePhoneAbstraction m1 = new HuaWeiMobilePhone(new ChatSoft());
        HuaWeiMobilePhone m2 = new HuaWeiMobilePhone(new GameSoft());

        m1.run();
        m2.run();

        m2.gpuTurborRun();
    }
}
