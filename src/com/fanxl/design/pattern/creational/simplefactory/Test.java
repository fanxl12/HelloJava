package com.fanxl.design.pattern.creational.simplefactory;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:51
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        video.make();

    }

}
