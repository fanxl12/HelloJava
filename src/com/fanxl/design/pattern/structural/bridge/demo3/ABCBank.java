package com.fanxl.design.pattern.structural.bridge.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 18:03
 */
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国农业银行账户");
        account.openAccount();
        return account;
    }
}
