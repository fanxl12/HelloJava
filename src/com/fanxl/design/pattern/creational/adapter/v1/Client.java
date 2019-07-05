package com.fanxl.design.pattern.creational.adapter.v1;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 15:30
 */
public class Client {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.setAdaptee(new Adaptee());
        System.out.println(adapter.request());
    }

}
