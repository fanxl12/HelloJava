package com.fanxl.design.pattern.structural.bridge.demo3;

/**
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 更容易理解的表述是：实现系统可从多种维度分类，桥接模式将各维度抽象出来，各维度独立变化，之后可通过聚合，将各维度组合起来，减少了各维度间的耦合
 *
 * 汽车可按品牌分（本例中只考虑BMT，BenZ，Land Rover），也可按手动档、自动档、手自一体来分。
 * 如果对于每一种车都实现一个具体类，则一共要实现3*3=9个类
 *
 * 使用桥接模式，只需要实现 3 + 3 = 6个类，且后续如果某一方发生变化，只需要独自修改即可，方便扩展
 * **/
public class Test {

    public static void main(String[] args) {
        Transmission auto = new Auto();
        AbstractCar benZCar = new BenZCar();
        benZCar.setTransmission(auto);
        benZCar.run();

        Transmission manual = new Manual();
        benZCar.setTransmission(manual);
        benZCar.run();
    }

}
