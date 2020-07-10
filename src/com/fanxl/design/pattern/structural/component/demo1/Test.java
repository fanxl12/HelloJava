package com.fanxl.design.pattern.structural.component.demo1;

public class Test {

    public static void main(String[] args) {
        Component folder = new Folder("图片");
        folder.add(new Leaf("111.jpg"));
        folder.add(new Leaf("112.png"));
        Component png = new Leaf("113.jpg");
        folder.add(png);
        folder.killVirus();
        png.killVirus();
    }
}
