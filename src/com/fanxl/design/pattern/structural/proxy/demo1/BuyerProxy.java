package com.fanxl.design.pattern.structural.proxy.demo1;

/**
 * @author fanxl12
 * @description 代理类，代理IBuyer工作，并且做了其他额外的事情，增强功能
 * 这个是静态代理模式
 * @date 2019/6/17 14:53
 */
public class BuyerProxy implements IBuyer {

    private IBuyer iBuyer;

    public BuyerProxy(IBuyer iBuyer) {
        this.iBuyer = iBuyer;
    }

    @Override
    public void login(String username, String password) {
        this.iBuyer.login(username, password);
    }

    @Override
    public void bugTicket() {
        before();
        this.iBuyer.bugTicket();
        after();
    }

    private void before() {
        System.out.println("准备工作做起来");
    }

    private void after() {
        System.out.println("刷票成功，微信通知...");
    }

}
