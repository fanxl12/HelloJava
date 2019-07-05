package com.fanxl.design.pattern.creational.adapter.v1;

/**
 * @author fanxl12
 * @description 适配者类 适配者即被适配的角色，它定义了一个已经存在的接口，这个接口
 * 需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可
 * 能没有适配者类的源代码
 * @date 2019/7/4 15:32
 */
public class Adaptee {

    public String specificRequest() {
        return "ok result";
    }
}
