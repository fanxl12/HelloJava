package com.fanxl.design.principle.dependenceinversion;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/28 0028 11:26
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("我学习java课程");
    }
}
