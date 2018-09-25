package com.fanxl.reflect;

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
        }


    }

}
