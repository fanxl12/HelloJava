package com.fanxl.design.pattern.structural.bridge.demo3;

public class BMWCar extends AbstractCar {

    @Override
    void run() {
        transmission.gear();
        System.out.println("BMW run...");
    }
}
