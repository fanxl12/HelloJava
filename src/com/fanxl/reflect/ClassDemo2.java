package com.fanxl.reflect;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 17:37
 */
public class ClassDemo2 {

    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = Integer.class;
        Class c3 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());


    }
}


