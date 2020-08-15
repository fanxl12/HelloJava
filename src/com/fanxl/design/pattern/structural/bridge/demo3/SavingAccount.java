package com.fanxl.design.pattern.structural.bridge.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 18:01
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开了一个定期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
