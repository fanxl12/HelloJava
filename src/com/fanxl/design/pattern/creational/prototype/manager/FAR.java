package com.fanxl.design.pattern.creational.prototype.manager;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 11:32
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
