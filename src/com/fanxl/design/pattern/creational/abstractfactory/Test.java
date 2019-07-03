package com.fanxl.design.pattern.creational.abstractfactory;

/**
 * @author fanxl12
 * @description
 * @date 2019/5/7 17:32
 */
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }

}
