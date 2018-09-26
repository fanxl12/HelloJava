package com.fanxl.reflect.method;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/26 0026 10:14
 */
public class Person {

    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a + "--" +b);
    }

    public int add(int a, int b) {
        return a + b;
    }

}
