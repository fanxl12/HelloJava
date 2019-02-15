package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 16:34
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
