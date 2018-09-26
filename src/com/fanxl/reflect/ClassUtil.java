package com.fanxl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 18:19
 */
public class ClassUtil {


    /**
     * 打印类的信息，包括类的成员函数和变量
     * @param object
     */
    public static void printClassMessage(Object object) {


        Class cl = object.getClass();
        System.out.println("类名称:" + cl.getName());

        // getMethods()方法获取的是所有的public的函数， 包括父类继承过来的
        // getDeclaredMethods() 获取的是所有该类的自己声明的方法
        Method[] methods = cl.getMethods();
        for (int i=0; i<methods.length; i++) {
            // 得到方法返回值类型的类类型
            Class returnType = methods[i].getReturnType();
            System.out.println(returnType.getName());
            // 得到方法的名称
            System.out.print(methods[i].getName() + "(");
            // 获取参数类型 --> 得到的是参数列表的类型的类类型
            Class[] paramTypes = methods[i].getParameterTypes();
            for (Class class1: paramTypes) {
                System.out.print("  " + class1.getName() + ",");
            }
            System.out.println(")");


            /**
             * 成员变量也是对象
             * Field类封装了关于成员变量的操作
             * getFields() 方法获取所有public的成员变量的信息
             * getDeclaredFields() 获取所有自己声明的方法
             *
             * */
//            Field[] fs = cl.getFields();
            Field[] fs = cl.getDeclaredFields();
            for (Field field: fs) {
                // 得到成员变量的类型的类类型
                Class fileType = field.getType();
                String typeName = fileType.getName();
                String fieldName = field.getName();
                System.out.println("成员变量 " + typeName + " " + fieldName);
            }
        }


    }

    /**
     * 打印对象的构造函数的信息
     * @param object
     */
    public static void printConMessage(Object object) {
        Class cl = object.getClass();

        /**
         * 构造函数也是对象
         * java.lang.Constructor中封装了构造函数的信息
         * getConstructors获取所有的public的构造函数
         * getDeclaredConstructors得到自己的构造函数
         * */
//        Constructor[] cs = cl.getConstructors();
        Constructor[] cs = cl.getDeclaredConstructors();

        for (Constructor constructor : cs) {
            System.out.print(constructor.getName() + "(");
            // 获取构造函数的参数列表 --> 得到的参数列表的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }

    }

}
