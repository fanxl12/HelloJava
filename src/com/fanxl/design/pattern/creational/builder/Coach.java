package com.fanxl.design.pattern.creational.builder;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 17:36
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String video, String article,String qa) {
        courseBuilder.setName(name);
        courseBuilder.setVideo(video);
        courseBuilder.setArticle(article);
        courseBuilder.setQa(qa);
        return courseBuilder.makeCourse();
    }
}
