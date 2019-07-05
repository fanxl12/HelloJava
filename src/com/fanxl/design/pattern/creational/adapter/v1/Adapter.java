package com.fanxl.design.pattern.creational.adapter.v1;

/**
 * @author fanxl12
 * @description 适配器类 适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进
 * 行适配，适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个
 * Adaptee对象使二者产生联系
 * @date 2019/7/4 15:34
 */
public class Adapter extends Target {

    /**
     * 维持一个对适配者对象的引用
     */
    private Adaptee adaptee;

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        // 转发调用
        return adaptee.specificRequest();
    }
}
