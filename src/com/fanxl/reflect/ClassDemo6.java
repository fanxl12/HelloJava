package com.fanxl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description
 * @author: fanxl
 * @date: 2018/10/14 0014 11:43
 */
public class ClassDemo6 {

    public static void main(String[] args) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try {
            Class clazz = classLoader.loadClass("com.fanxl.reflect.Foo");
            Constructor cons = clazz.getDeclaredConstructor(String.class);
            Foo foo = (Foo) cons.newInstance("张三");
            foo.print();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
