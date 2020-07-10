package com.fanxl.design.pattern.structural.bridge.demo1;

public abstract class MobilePhoneAbstraction {

    protected SoftImplementor softImplementor;

    public abstract void run();

    public MobilePhoneAbstraction(SoftImplementor impl) {
        this.softImplementor = impl;
    }
}
