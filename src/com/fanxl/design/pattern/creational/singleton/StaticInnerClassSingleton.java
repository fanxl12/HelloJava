package com.fanxl.design.pattern.creational.singleton;

/**
 * @description 静态内部类
 * 基于类初始化的延迟加载解决方案，既能延迟加载，又由虚拟机保证了多线程环境下的一致性
 * @author: fanxl
 * @date: 2019/2/16 0016 19:47
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new IllegalArgumentException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private final static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

}
