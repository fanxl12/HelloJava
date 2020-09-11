package com.fanxl.design.pattern.behavior.subject.demo1;

/**
 * 具体观察者（订阅者）
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        // 主题有更新之后，执行的具体订阅（通知）方法
        System.out.println("我收到了通知~");
    }
}