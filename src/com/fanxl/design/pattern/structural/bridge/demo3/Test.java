package com.fanxl.design.pattern.structural.bridge.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 18:07
 */
public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }

}
