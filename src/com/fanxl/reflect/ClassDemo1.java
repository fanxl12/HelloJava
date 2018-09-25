package com.fanxl.reflect;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 17:37
 */
public class ClassDemo1 {

    public static void main(String[] args) {
        //Foo的实例对象如何表示
        //foo1就表示出来了
        Foo foo1 = new Foo();
        //Foo这个类也是一个实例对象，Class类的实例对战
        //任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        //第一种方式 --> 实际在告诉我们任何一个类都有一个隐含的静态成员对象
        Class c1 = Foo.class;

        //第二种表达方式 已知该类的对象，通过getClass方法
        Class c2 = foo1.getClass();

        /*
         *
         * 官网c1，c2表示了Foo类的类类型(class type)
         * 万事万物皆对象
         * 类也是对象，是Class类的实例对象
         * 这个对象我们也称为该类的类类型
         *
         */

        // 不管c1 or c2都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("com.fanxl.reflect.Foo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c2 == c3);

        //我们可以通过c1 or c2 or c3创建Foo的实例对象
        //需要有无参的构造方法
        try {
            Foo foo = (Foo) c1.newInstance();
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}


