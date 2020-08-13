package com.fanxl.design.pattern.structural.proxy.demo3;

/**
 * @description 代理模式  静态代理
 * @author: fanxl
 * @date: 2020/8/13 0013 22:11
 */
public class Test {

    public static void main(String[] args) {
        Ren zhangSan = new ZhangSan();
        Ren lvShi = new LvShi(zhangSan);
        lvShi.bianJie("事情...");
    }

}
