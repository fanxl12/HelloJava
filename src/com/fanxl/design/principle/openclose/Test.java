package com.fanxl.design.principle.openclose;

/**
 * @description 开闭原则 ： 对扩展开发 对修改关闭
 * @author: fanxl
 * @date: 2018/12/28 0028 10:30
 */
public class Test {

    public static void main(String[] args) {
        ICource iCource = new JavaCourse(98, "Java架构师", 218D);
        System.out.println(iCource.getId() + "-" + iCource.getName() + "-" + iCource.getPrice());

        ICource discountCourse = new JavaDiscountCourse(98, "Java架构师", 218D);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) discountCourse;
        System.out.println(javaDiscountCourse.getId() + "-" + javaDiscountCourse.getName() + "-" + javaDiscountCourse.getOriginalPrice() + "-" + javaDiscountCourse.getPrice());
    }

}
