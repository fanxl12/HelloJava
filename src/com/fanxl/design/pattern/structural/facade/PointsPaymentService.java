package com.fanxl.design.pattern.structural.facade;

/**
 * @description
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
