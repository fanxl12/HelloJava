package com.fanxl.design.pattern.creational.singleton;

import java.io.*;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/16 0016 15:48
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton lazySingleton = LazySingleton.getInstance();

//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//        t1.start();
//        t2.start();
//        System.out.println("program run end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungry-singleton"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hungry-singleton"));
        HungrySingleton instance1 = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(instance1);

        System.out.println(instance == instance1);

    }

}
