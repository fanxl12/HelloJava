package com.fanxl.thread.atomic;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * 代表学生的Student类
 * @author yinwenjie
 */
public class Student {
    /**
     * 学生成绩
     */
    private volatile Performance performance;

    /**
     * 学生成绩“更改者”
     */
    // 会重点讲解关于“更改器”的参数问题
    private AtomicReferenceFieldUpdater<Student, Performance> performance_updater = AtomicReferenceFieldUpdater
        .newUpdater(Student.class, Performance.class, "performance");

    /**
     * 学生姓名
     */
    private String name;

    public Student() {}
 
    public Student(String name , Integer performance) {
        this.name = name;
        this.performance = new Performance();
        this.performance.setPerformance(performance);
    }
 
    /**
     * @return the performance
     */
    public Performance getPerformance() {
        return performance;
    }

    /**
     * @param performance the performance to set
     */
    public void setPerformance(Performance performance) {
        // 注意，这里设置的是updater，而不是直接设置performance属性
        performance_updater.set(this, performance);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}