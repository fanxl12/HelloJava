package com.fanxl.design.pattern.structural.component.demo1;

public abstract class Component {

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract Component get(int i);

    public abstract void killVirus();

}
