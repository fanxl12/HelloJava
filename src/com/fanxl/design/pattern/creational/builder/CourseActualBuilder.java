package com.fanxl.design.pattern.creational.builder;

/**
 * @description 具体建造者
 * @author: fanxl
 * @date: 2019/2/15 0015 17:33
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void setName(String name) {
        course.setName(name);
    }

    @Override
    public void setVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void setArticle(String article) {
        course.setArticle(article);
    }

    @Override
    public void setQa(String qa) {
        course.setQa(qa);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
