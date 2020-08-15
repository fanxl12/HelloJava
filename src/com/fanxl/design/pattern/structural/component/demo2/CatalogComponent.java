package com.fanxl.design.pattern.structural.component.demo2;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 15:21
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public abstract String getName();

    public double getPrice() {
        throw new UnsupportedOperationException("不支持获取价格");
    }

    public abstract void print();

}
