package com.fanxl.design.pattern.structural.flyweight.demo1;

/**
 * @description 享元模式 抽象类 抽象享元角色
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public abstract class Subject {

    // 外部状态 动态变更
    private String student;

    // 内部状态 进行共享
    protected final String name;

    public Subject(String name) {
        this.name = name;
    }

    // 定义的业务操作
    public abstract void operate();

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }
}
