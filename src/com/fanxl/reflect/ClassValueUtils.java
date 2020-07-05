package com.fanxl.reflect;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/21 0021 16:56
 */
public class ClassValueUtils {

    public static void test(Object bean) {
        List<Field> fields = new ArrayList<>(Arrays.asList(bean.getClass().getDeclaredFields()));
        Class parent = bean.getClass().getSuperclass();
        while (!parent.getName().equals("java.lang.Object")) {
            fields.addAll(Arrays.asList(parent.getDeclaredFields()));
            parent = parent.getSuperclass();
        }
        for (Field field : fields) {
            try {
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                Object value = field.get(bean);
                if (value != null) {
                    String name = field.getName();
                    System.out.println("name:" + name + "  value:" + value);
                }
                field.setAccessible(isAccessible);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
