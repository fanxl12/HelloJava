package com.fanxl.design.pattern.creational.builder.v2;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 17:59
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderName("Java").builderVideo("Java视频")
                .builderArticle("Java手记").build();
        System.out.println(course);
    }
}
