package com.fanxl.design.pattern.creational.factorymethod;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:51
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory1 = new PythonVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
