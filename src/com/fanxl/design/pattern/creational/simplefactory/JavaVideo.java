package com.fanxl.design.pattern.creational.simplefactory;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:48
 */
public class JavaVideo implements Video {

    @Override
    public void make() {
        System.out.println("已制作Java视频");
    }
}
