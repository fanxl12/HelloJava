package com.fanxl.design.principle.openclose;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/28 0028 11:09
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

}
