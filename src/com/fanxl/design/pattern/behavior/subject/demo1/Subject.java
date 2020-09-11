package com.fanxl.design.pattern.behavior.subject.demo1;

/**
 * 抽象主题（发布者接口）
 */
public interface Subject {
    // 添加观察者（订阅者）
    public void attach(Observer o);
    // 删除观察者（订阅者）
    public void detach(Observer o);
    // 通知所有观察者（订阅者）
    public void notifyObservers();
}