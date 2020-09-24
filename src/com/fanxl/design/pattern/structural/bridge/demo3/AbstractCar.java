package com.fanxl.design.pattern.structural.bridge.demo3;

public abstract class AbstractCar {

    protected Transmission transmission;

    abstract void run();

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
