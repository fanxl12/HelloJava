package com.fanxl.lambda.demo1;

import java.util.function.*;

/**
 * @description 方法引用
 * @author: fanxl
 * @date: 2018/12/4 0004 10:12
 */
class Dog {

    private String name = "哮天犬";

    /**
     * 默认狗粮
     */
    private int food = 10;

    public Dog () {}

    public Dog (String name) {
        this.name = name;
    }

    public static void bark(Dog dog) {
        System.out.println(dog + "叫了");
    }

    /**
     * 默认非静态方法，实际上java会在第一个参数上传入this
     * @param num
     * @return
     */
    public int eat(Dog this, int num) {
        System.out.println("吃了" + num + "斤狗粮");
        this.food -= num;
        return this.food;
    }

    @Override
    public String toString() {
        return name;
    }
}


public class MethodRefrenceDemo {

    public static void main(String[] args) {
        // 函数式
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("你接收的是");
        // 方法引用
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("我接收的是");

        Dog dog = new Dog();
        dog.eat(3);

        // 静态方法的方法引用
        Consumer<Dog> consumer = Dog::bark;
        consumer.accept(dog);

        //非静态方法, 使用对象实例的方法引用
        Function<Integer, Integer> function = dog::eat;
        System.out.println("还剩下" + function.apply(2) + "斤狗粮");

        UnaryOperator<Integer> unaryOperator = dog::eat;
        System.out.println("还剩下" + unaryOperator.apply(1) + "斤狗粮");

        IntUnaryOperator intUnaryOperator = dog::eat;
        System.out.println("还剩下" + intUnaryOperator.applyAsInt(1) + "斤狗粮");

        // 使用类名来进行方法的引用，利用java默认第一个参数传入this的特性
        BiFunction<Dog, Integer, Integer> biFunction = Dog::eat;
        System.out.println("还剩下" + biFunction.apply(dog, 1) + "斤狗粮");

        // 构造函数的方法引用
        Supplier<Dog> supplier = Dog::new;
        System.out.println("创造了新对象:" + supplier.get());

        // 带参数的构造函数的方法引用
        Function<String, Dog> function1 = Dog::new;
        System.out.println("创造了新对象:" + function1.apply("旺财"));



    }

}
