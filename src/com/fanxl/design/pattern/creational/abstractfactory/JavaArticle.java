package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 16:32
 */
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("我写了Java手记");
    }
}
