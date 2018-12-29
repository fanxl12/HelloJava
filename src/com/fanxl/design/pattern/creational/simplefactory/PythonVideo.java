package com.fanxl.design.pattern.creational.simplefactory;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:49
 */
public class PythonVideo implements Video {

    @Override
    public void make() {
        System.out.println("已制作Python视频");
    }
}
