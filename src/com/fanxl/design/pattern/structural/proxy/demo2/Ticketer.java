package com.fanxl.design.pattern.structural.proxy.demo2;

/**
 * @Desc 没有实现任何接口的购票类，可以看出功能和Buyer完全一致，只是没有实现接口
 * @Author chaozhou
 */
public class Ticketer {

    private String name; // 模拟当前购票人

    public Ticketer(String name) {
        this.name = name;
    }

    public Ticketer() {
    }

    public void login(String username, String password) {
        System.out.println("用户：" + username + " 使用密码：" + password + " 已登录成功");
    }

    public void bugTicket() {
        System.out.println(name + " 正在购票");
    }
}