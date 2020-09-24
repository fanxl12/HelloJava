package com.fanxl.design.pattern.structural.bridge.demo3;

public class Auto implements Transmission {

    @Override
    public void gear() {
        System.out.println("自动挡...");
    }
}
