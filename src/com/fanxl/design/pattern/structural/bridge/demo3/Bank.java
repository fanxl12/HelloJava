package com.fanxl.design.pattern.structural.bridge.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 18:02
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    public abstract Account openAccount();

}
