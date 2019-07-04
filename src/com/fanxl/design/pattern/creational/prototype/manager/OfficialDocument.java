package com.fanxl.design.pattern.creational.prototype.manager;

public interface OfficialDocument extends Cloneable {

    OfficialDocument clone();

    void display();
}