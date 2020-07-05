package com.fanxl.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @description 容器单例类 非线程安全
 * @author: fanxl
 * @date: 2019/2/17 0017 21:11
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> objectMap = new HashMap<>();

    public static void putInstance(String key, Object value) {
        if (key !=null && value !=null) {
            if (!objectMap.containsKey(key)) {
                objectMap.put(key, value);
            }
        }
    }

    public static Object getInstance(String key) {
        return objectMap.get(key);
    }


}
