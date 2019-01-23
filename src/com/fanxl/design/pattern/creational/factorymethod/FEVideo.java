package com.fanxl.design.pattern.creational.factorymethod;

/**
 * @description
 * @author: fanxl
 * @date: 2018/12/29 0029 11:48
 */
public class FEVideo extends Video {

    @Override
    public void produce() {
        System.out.println("已制作FE视频");
    }
}
