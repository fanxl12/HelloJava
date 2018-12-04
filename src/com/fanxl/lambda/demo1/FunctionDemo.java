package com.fanxl.lambda.demo1;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @description 函数接口
 * @author: fanxl
 * @date: 2018/12/4 0004 10:07
 */
public class FunctionDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i > 0;
        System.out.println(predicate.test(10));

        BiFunction<String, Integer, String> biFunction = (str, number) -> str + ":" + number + "岁";
        System.out.println(biFunction.apply("我的年龄是", 18));



    }

}
