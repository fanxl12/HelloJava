package com.fanxl.reflect;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 17:37
 */
public class ClassDemo3 {

    public static void main(String[] args) {

        Child child = new Child();
        child.setName("ZhangSan");
        child.setAge(12);
        child.setAddress("湖北省武汉市");
//        ClassUtil.printClassMessage(child);

        ClassValueUtils.test(child);


    }
}


