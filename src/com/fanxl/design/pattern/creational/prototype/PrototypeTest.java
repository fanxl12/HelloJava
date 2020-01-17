package com.fanxl.design.pattern.creational.prototype;

/**
 * @author fanxl12
 * @description 原型模式
 * @date 2019/7/4 10:34
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcreteJavaPrototype concreteJavaPrototype = new ConcreteJavaPrototype();
        concreteJavaPrototype.setAttr("123");
        ConcreteJavaPrototype concreteJavaPrototype1 = concreteJavaPrototype.clone();
        System.out.println(concreteJavaPrototype == concreteJavaPrototype1);

        Prototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("234");
        Prototype concretePrototype1 = concretePrototype.clone();
        System.out.println(concretePrototype == concretePrototype1);
    }

}
