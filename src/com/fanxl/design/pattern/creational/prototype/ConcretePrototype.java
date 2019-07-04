package com.fanxl.design.pattern.creational.prototype;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 9:03
 */
public class ConcretePrototype implements Prototype {

    private String attr;

    @Override
    public String getAttr() {
        return attr;
    }

    @Override
    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
