package com.fanxl.thread.atomic;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        Performance newPerformance = new Performance();
        newPerformance.setPerformance(80);
        // 注意，这样student中的performance属性
        // 就是用了乐观机制，保证了操作的线程安全性
        student.setPerformance(newPerformance);

        // 再设置一次
        Performance otherPerformance = new Performance();
        otherPerformance.setPerformance(100);
        student.setPerformance(otherPerformance);
        System.out.println("student还是一个");
        System.out.println(newPerformance + "和" + otherPerformance + "不一样了");
    }

}
