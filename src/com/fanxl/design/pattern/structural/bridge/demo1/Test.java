package com.fanxl.design.pattern.structural.bridge.demo1;

public class Test {

    public static void main(String[] args) {
        MobilePhoneAbstraction m1 = new HuaWeiMobilePhone(new ChatSoft());
        HuaWeiMobilePhone m2 = new HuaWeiMobilePhone(new GameSoft());

        m1.run();
        m2.run();

        m2.gpuTurborRun();
    }
}
