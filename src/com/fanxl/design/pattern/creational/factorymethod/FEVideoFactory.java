package com.fanxl.design.pattern.creational.factorymethod;

/**
 * @description
 * @author: fanxl
 * @date: 2019/1/23 0023 12:55
 */
public class FEVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
