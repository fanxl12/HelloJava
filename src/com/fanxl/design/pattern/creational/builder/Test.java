package com.fanxl.design.pattern.creational.builder;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 17:39
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java课程", "Java视频", "Java手记", "Java问答");
        System.out.println(course);
    }

}
