package com.fanxl.design.pattern.structural.decorator.v2;

/**
 * @description 装饰具体实现类 (具体某个装饰角色)
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
