package com.fanxl.design.pattern.structural.proxy.demo1;

/**
 * @Desc 购票接口的具体实现类
 * @Author chaozhou
 */
public class Buyer implements IBuyer{

    private String name; // 模拟当前购票人

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println("用户：" + username + " 使用密码：" + password + " 已登录成功");
    }

    @Override
    public void bugTicket() {
        System.out.println("正在购买" + name);
    }
}