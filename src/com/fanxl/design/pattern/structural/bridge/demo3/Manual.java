package com.fanxl.design.pattern.structural.bridge.demo3;

public class Manual implements Transmission {

    @Override
    public void gear() {
        System.out.println("手动挡...");
    }
}
