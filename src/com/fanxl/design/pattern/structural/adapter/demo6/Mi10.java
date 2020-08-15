package com.fanxl.design.pattern.structural.adapter.demo6;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 9:58
 */
public class Mi10 {

    public static void main(String[] args) {
        DC5 dc5 = new XiaoMiAdapter();
        System.out.println("充电中，电流:" + dc5.getDc5());
    }

}
