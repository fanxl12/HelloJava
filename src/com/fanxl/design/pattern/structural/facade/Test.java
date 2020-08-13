package com.fanxl.design.pattern.structural.facade;

/**
 * @description 外观模式
 * @author: fanxl
 * @date: 2020/7/5 0005 21:10
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
