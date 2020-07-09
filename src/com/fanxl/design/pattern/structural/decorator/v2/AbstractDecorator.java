package com.fanxl.design.pattern.structural.decorator.v2;

/**
 * @description 装饰抽象类 (抽象装饰角色)
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public abstract class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
