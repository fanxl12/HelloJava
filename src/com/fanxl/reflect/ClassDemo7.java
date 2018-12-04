package com.fanxl.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description 利用反射对私有的方法和变量进行赋值和调用
 * @author: fanxl
 * @date: 2018/10/14 0014 11:43
 */
public class ClassDemo7 {

    public static void main(String[] args) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            Class clazz = classLoader.loadClass("com.fanxl.reflect.Student");
            Student student = (Student) clazz.newInstance();

            Field field = clazz.getDeclaredField("name");
            // 取消java检查权限
            field.setAccessible(true);
            field.set(student, "王五");

            Method method = clazz.getDeclaredMethod("sayName", null);
            method.setAccessible(true);
            method.invoke(student, null);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
