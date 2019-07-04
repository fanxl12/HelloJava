package com.fanxl.design.pattern.creational.prototype.manager;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 11:32
 */
public class SAS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument sas = null;
        try {
            sas = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return sas;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
