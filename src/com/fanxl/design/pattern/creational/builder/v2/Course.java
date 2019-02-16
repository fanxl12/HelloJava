package com.fanxl.design.pattern.creational.builder.v2;

/**
 * @description
 * @author: fanxl
 * @date: 2019/2/15 0015 17:30
 */
public class Course {

    private String name;

    private String video;

    private String article;

    private String qa;

    public Course(CourseBuilder builder) {
        this.name = builder.name;
        this.video = builder.video;
        this.article = builder.article;
        this.qa = builder.qa;
    }

    static class CourseBuilder {

        private String name;

        private String video;

        private String article;

        private String qa;

        public CourseBuilder builderName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder builderVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder builderArticle(String article) {
            this.article = article;
            return this;
        }

        public CourseBuilder builderQa(String qa) {
            this.qa = qa;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
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
