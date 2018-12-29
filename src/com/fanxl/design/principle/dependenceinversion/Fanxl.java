package com.fanxl.design.principle.dependenceinversion;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/28 0028 11:25
 */
public class Fanxl {

    public void studyOnlineCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

}
