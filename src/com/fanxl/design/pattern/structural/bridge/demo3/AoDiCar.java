package com.fanxl.design.pattern.structural.bridge.demo3;

public class AoDiCar extends AbstractCar {

    @Override
    void run() {
        transmission.gear();
        System.out.println("AoDi run...");
    }
}
