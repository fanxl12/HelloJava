package com.fanxl.design.pattern.structural.bridge.demo3;

public class BenZCar extends AbstractCar {


    @Override
    void run() {
        transmission.gear();
        System.out.println("BenZ run...");
    }
}
