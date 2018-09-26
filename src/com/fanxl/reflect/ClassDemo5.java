package com.fanxl.reflect;

import com.fanxl.reflect.method.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 17:37
 */
public class ClassDemo5 {

    public static void main(String[] args) {

        Person person = new Person();
        Class cl = person.getClass();

        try {
            /**
             * 获取方法 名称和参数列表来决定
             * getMethod 获取的是public的方法
             * getDeclaredMethod() 获取自己声明的方法
             * */
            Method m = cl.getMethod("print", int.class, int.class);
            // 方法的反射操作
            m.invoke(person, new Object[]{1, 2});

            Method add = cl.getMethod("add", int.class, int.class);
            // 如果方法有返回值会返回具体的返回值，如果没有就是null
            Object result = add.invoke(person, 10, 20);
            System.out.println("结果:" + result);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}


