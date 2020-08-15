package com.fanxl.design.pattern.structural.component.demo2;

/**
 * @description
 * @author: fanxl
 * @date: 2020/8/15 0015 17:20
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linux = new Course("Linux课程", 12);
        CatalogComponent windows = new Course("Windows课程", 23);

        CatalogComponent javaCatalog = new CourseCatalog("Java", 2);
        javaCatalog.add(new Course("Spring", 12.6));
        javaCatalog.add(new Course("Mybatis", 16.6));

        CatalogComponent mook = new CourseCatalog("Mook网", 1);
        mook.add(linux);
        mook.add(windows);
        mook.add(javaCatalog);
        mook.print();
    }

}
