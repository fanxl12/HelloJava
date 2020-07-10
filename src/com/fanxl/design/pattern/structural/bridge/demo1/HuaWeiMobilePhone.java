package com.fanxl.design.pattern.structural.bridge.demo1;

public class HuaWeiMobilePhone extends MobilePhoneAbstraction{

    public HuaWeiMobilePhone(SoftImplementor impl) {
        super(impl);
    }

    @Override
    public void run() {
        // 使用委托：调用HuaWeiMobilePhone的run时，实际调用的是SoftImplementor的rawRun
        this.softImplementor.rawRun();
    }

    public void gpuTurborRun(){
        System.out.println("GPU Turbo Running start...");
        this.run();
        System.out.println("GPU Turbo Running end...");
    }
}