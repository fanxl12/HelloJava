package com.fanxl.lambda.demo1;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/4 0004 9:34
 */
public class InterfaceMain {

    public static void main(String[] args) {
        MyInterface myInterface1 = (i) -> i * 2;
        // 这种最常见
        MyInterface myInterface2 = i -> i * 2;

        MyInterface myInterface3 = (int i) -> i * 2;

        // 方法里面多行运算
        MyInterface myInterface4 = (int i) -> {
            System.out.println("i是:" + i);
            return i * 2;
        };
    }

}
