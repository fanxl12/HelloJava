package com.fanxl.design.principle.dependenceinversion;

/**
 * @description 依赖倒置原则  高层不依赖底层 两者依赖抽象
 * @author: fanxl
 * @date: 2018/12/28 0028 11:27
 */
public class Test {

    public static void main(String[] args) {
        Fanxl fanxl = new Fanxl();
        fanxl.studyOnlineCourse(new JavaCourse());
        fanxl.studyOnlineCourse(new PythonCourse());
    }

}
