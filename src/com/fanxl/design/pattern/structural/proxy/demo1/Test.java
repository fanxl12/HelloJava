package com.fanxl.design.pattern.structural.proxy.demo1;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/13 0013 22:04
 */
public class Test {

    public static void main(String[] args) {
        IBuyer buyer = new Buyer("火车票");
        buyer.bugTicket();

        IBuyer iBuyer = new BuyerProxy(buyer);
        iBuyer.login("张三", "123");
        iBuyer.bugTicket();
    }
}
