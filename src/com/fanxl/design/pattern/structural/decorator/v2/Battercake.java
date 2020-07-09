package com.fanxl.design.pattern.structural.decorator.v2;

/**
 * @description 被装饰具体实现类 (具体构件，即被装饰的对象)
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
