package com.fanxl.reflect.dynamic;

/**
 * @description
 * @author: fanxl
 * @date: 2018/9/25 0025 18:02
 */
public class OfficeBetter {

    public static void main(String[] args) {

        try {
            // 动态加载类
            Class c = Class.forName("com.fanxl.reflect.dynamic.Word");
            OfficeAble officeAble = (OfficeAble) c.newInstance();
            officeAble.start();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }

}
