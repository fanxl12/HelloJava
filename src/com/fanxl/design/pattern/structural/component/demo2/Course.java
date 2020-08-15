package com.fanxl.design.pattern.structural.component.demo2;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 15:25
 */
public class Course extends CatalogComponent {

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("课程:" + getName() + " - 价格:" + getPrice());
    }
}
