package com.fanxl.design.pattern.creational.builder;

/**
 * @description 产品角色
 * @author: fanxl
 * @date: 2019/2/15 0015 17:30
 */
public class Course {

    private String name;

    private String video;

    private String article;

    private String qa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }
}
