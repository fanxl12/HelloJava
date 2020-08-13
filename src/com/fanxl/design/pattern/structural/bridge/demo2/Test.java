package com.fanxl.design.pattern.structural.bridge.demo2;

/**
 * @description 桥接模式 案例2
 * @author: fanxl
 * @date: 2020/8/13 0013 21:53
 */
public class Test {

    public static void main(String[] args) {
        AreaA a = new AreaA1();
        a.qiao = new AreaB1();
        a.fromAreaA();
        a.qiao.targetAreaB();
    }

}
