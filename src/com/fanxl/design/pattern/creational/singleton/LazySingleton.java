package com.fanxl.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description 懒汉式
 * @author: fanxl
 * @date: 2019/2/16 0016 15:45
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private static boolean flag = true;

    private LazySingleton(){
        if (flag) {
            flag = false;
        }else {
            throw new IllegalArgumentException("单例构造器禁止反射调用");
        }

    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        LazySingleton newInstance = LazySingleton.getInstance();

        Field flag = newInstance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(newInstance, true);

        LazySingleton instance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }


}
