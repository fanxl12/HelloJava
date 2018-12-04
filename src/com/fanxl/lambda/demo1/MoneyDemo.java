package com.fanxl.lambda.demo1;

import java.text.DecimalFormat;
import java.util.function.Function;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/4 0004 9:43
 */
interface IMoneyFormat {
    /**
     * 对于lambda，它不需要关系实现的是啥，它只关系输入的是什么，返回的是什么
     * @param i
     * @return
     */
    String format(int i);
}

class MyMoney {
    private final int money;

    public MyMoney(int money) {
        this.money = money;
    }

    public void printMoney(IMoneyFormat moneyFormat) {
        System.out.println("我的存款:" + moneyFormat.format(this.money));
    }

    /**
     * 所以鉴于lambda的特性，可以直接指定输入、输出类型，这样就不需要定义接口了
     * @param moneyFormat
     */
    public void printMoney2(Function<Integer, String> moneyFormat) {
        System.out.println("我的存款:" + moneyFormat.apply(this.money));
    }
}


public class MoneyDemo {

    public static void main(String[] args) {
        MyMoney myMoney = new MyMoney(999999999);
        myMoney.printMoney(i -> new DecimalFormat("#,###").format(i));
        // 函数式编程好处1.不需要定义接口
        myMoney.printMoney2(i -> new DecimalFormat("#,###").format(i));
        // 函数式编程好处2. 链式操作
        Function<Integer, String> function = i -> new DecimalFormat("#,###").format(i);
        myMoney.printMoney2(function.andThen(s -> "人民币" + s));
    }

}
