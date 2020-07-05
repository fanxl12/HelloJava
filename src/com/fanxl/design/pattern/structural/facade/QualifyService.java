package com.fanxl.design.pattern.structural.facade;

/**
 * @description
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }
}
