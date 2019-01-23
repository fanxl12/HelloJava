package com.fanxl.reflect.parent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2019/1/7 0007 11:06
 */
public class Test {

    public static void main(String[] args) {

        Man man = new Man();
        man.setName("张三");
        man.setEye("黑色的眼睛");
        man.setBig("很大");

        Class cz = man.getClass();

        List<Field> fields = new ArrayList<>();
        fields.addAll(Arrays.asList(cz.getDeclaredFields()));
        System.out.println("数量:" + fields.size());

        Class superCz = cz.getSuperclass();

        while (superCz != null && superCz != Object.class) {
            fields.addAll(Arrays.asList(superCz.getDeclaredFields()));
            System.out.println("数量:" + fields.size());
            superCz = superCz.getSuperclass();
        }


    }

}
