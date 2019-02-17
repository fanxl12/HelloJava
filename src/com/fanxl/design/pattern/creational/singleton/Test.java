package com.fanxl.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/16 0016 15:48
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program run end");

//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungry-singleton"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hungry-singleton"));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();


//        Class objectClass = HungrySingleton.class;
        Class objectClass = StaticInnerClassSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(instance == newInstance);

    }

}
