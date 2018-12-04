package com.fanxl.lambda.demo1;

import java.util.function.Function;

/**
 * @description 级联表达式和柯里化
 * 柯里化： 把多个参数的函数转换为一个参数的函数
 * 柯里化目的： 函数标准化
 * @author: fanxl
 * @date: 2018/12/4 0004 11:47
 */
public class CurryDemo {

    public static void main(String[] args) {
        // 实现了 x + y 的级联表达式
        Function<Integer, Function<Integer, Integer>> fun1 = x -> y -> x + y;
        System.out.println(fun1.apply(2).apply(4));

        Function<Integer, Function<Integer, Function<Integer, Integer>>> fun2 = x -> y -> z -> x + y + z;
        System.out.println(fun2.apply(1).apply(2).apply(3));

        int[] numList = {2, 4, 5};
        Function function = fun2;
        for (int i = 0; i < numList.length; i++) {
            if (function instanceof Function) {
                Object obj = function.apply(numList[i]);
                if (obj instanceof Function) {
                    function = (Function) obj;
                } else {
                    System.out.println("调用结束:" + obj);
                }
            }
        }

    }

}
