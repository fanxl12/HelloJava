package com.fanxl.design.pattern.creational.prototype;

/**
 * @author fanxl12
 * @description 要实现Cloneable接口，表示这个java类支持被复制
 * @date 2019/7/4 9:37
 */
public class ConcreteJavaPrototype implements Cloneable  {

    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    protected ConcreteJavaPrototype clone()  {
        ConcreteJavaPrototype object = null;
        try {
            object = (ConcreteJavaPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
