package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 16:31
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("我生成了JavaVideo");
    }
}
