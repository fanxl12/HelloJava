package com.fanxl.design.pattern.structural.decorator.v2;

/**
 * @description 装饰具体实现类 (具体某个装饰角色)
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
