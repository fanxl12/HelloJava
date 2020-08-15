package com.fanxl.design.pattern.structural.component.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 17:18
 */
public class CourseCatalog extends CatalogComponent {

    private String name;

    private Integer level;

    private List<CatalogComponent> list;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
        this.list = new ArrayList<>();
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        list.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        list.remove(catalogComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("当前目录:" + getName());
        for (CatalogComponent item : list) {
            if (level != null) {
                for (int i=0; i<level; i++) {
                    System.out.print(" ");
                }
            }
            item.print();
        }
    }
}
