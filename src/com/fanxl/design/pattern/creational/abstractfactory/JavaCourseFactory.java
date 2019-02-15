package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 16:31
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
