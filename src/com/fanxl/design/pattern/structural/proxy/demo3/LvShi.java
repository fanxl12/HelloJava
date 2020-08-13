package com.fanxl.design.pattern.structural.proxy.demo3;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/13 0013 22:09
 */
public class LvShi extends Ren {

    private Ren ren;

    public LvShi(Ren ren) {
        this.ren = ren;
    }

    @Override
    void bianJie(String word) {
        before();
        ren.bianJie("我想说:" + word);
        after();
    }

    private void before() {
        System.out.println("准备工作做起来");
    }

    private void after() {
        System.out.println("专业知识刷起来...");
    }
}
