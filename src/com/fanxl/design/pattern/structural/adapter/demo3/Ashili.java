package com.fanxl.design.pattern.structural.adapter.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/13 0013 22:30
 */
public class Ashili extends Adapter {

    @Override
    public void a(){
        System.out.println("实现A方法被调用");
    }

    @Override
    public void d(){
        System.out.println("实现d方法被调用");
    }
}
