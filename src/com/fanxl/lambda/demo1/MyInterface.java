package com.fanxl.lambda.demo1;

/**
 * @description FunctionalInterface 的接口可以使用lambda表达式，
 * 要求里面必须只有一个接口，
 * 还可以定义一个默认方法
 * @author: fanxl
 * @date: 2018/12/4 0004 9:29
 */
@FunctionalInterface
public interface MyInterface {

    /**
     * 计算
     * @param i
     * @return
     */
    int doubleNumber(int i);

    /**
     * 求和
     * @param x
     * @param y
     * @return
     */
    default int add(int x, int y){
        return x + y;
    }
}
