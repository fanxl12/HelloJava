package com.fanxl.design.pattern.structural.facade;

/**
 * @description
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
