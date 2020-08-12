package com.fanxl.design.pattern.structural.flyweight.demo1;

/**
 * @description 享元模式实现类 具体的享元角色
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class ConcreteSubject extends Subject {

    public ConcreteSubject(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println(getStudent() + "正在进行" + getName() + "考试...");
    }
}
