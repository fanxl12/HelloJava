package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 16:35
 */
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("我写Python手记");
    }
}
