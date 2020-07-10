package com.fanxl.design.pattern.structural.component.demo1;

public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        throw new RuntimeException("不支持此方法");
    }

    @Override
    public void remove(Component c) {
        throw new RuntimeException("不支持此方法");
    }

    @Override
    public Component get(int i) {
        throw new RuntimeException("不支持此方法");
    }

    @Override
    public void killVirus() {
        System.out.println("对" + name + "进行杀毒");
    }
}
