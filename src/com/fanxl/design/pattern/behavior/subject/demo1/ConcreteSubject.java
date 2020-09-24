package com.fanxl.design.pattern.behavior.subject.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题（发布者）
 */
public class ConcreteSubject implements Subject {
    // 存放观察者（订阅者）
    private List<Observer> list = new ArrayList<Observer>();
    @Override
    public void attach(Observer o) {
        // 添加观察者（订阅者）
        list.add(o);
    }
    @Override
    public void detach(Observer o) {
        // 删除观察者（订阅者）
        list.remove(o);
    }
    @Override
    public void notifyObservers() {
        // 通知所有观察者（订阅者）
        for (Observer o : list) {
            o.update();
        }
    }
    /**
     * 通知方法
     */
    public void change() {
        this.notifyObservers();
    }
}