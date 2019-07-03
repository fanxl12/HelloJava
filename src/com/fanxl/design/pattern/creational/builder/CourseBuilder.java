package com.fanxl.design.pattern.creational.builder;

/**
 * @description 抽象建造者
 * @author: fanxl
 * @date: 2019/2/15 0015 17:31
 */
public abstract class CourseBuilder {

    public abstract void setName(String name);

    public abstract void setVideo(String video);

    public abstract void setArticle(String article);

    public abstract void setQa(String qa);

    public abstract Course makeCourse();

}
