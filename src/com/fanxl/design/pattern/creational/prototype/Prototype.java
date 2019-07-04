package com.fanxl.design.pattern.creational.prototype;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 9:14
 */
public interface Prototype {

    Prototype clone();

    String getAttr();

    void setAttr(String attr);

}
