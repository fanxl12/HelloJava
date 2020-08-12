package com.fanxl.design.pattern.structural.flyweight.demo1;

/**
 * @description 享元模式是以共享的模式来支持大量细粒度对象的复用
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class Main {

    public static void main(String[] args) {
        // 假设3个考生 考2门科目考试
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Subject examInfo = FlyweightFactory.getFlyweight("科目" + j);
                examInfo.setStudent("考生" + i);
                examInfo.operate();
            }
        }
    }
}
