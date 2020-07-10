package com.fanxl.design.pattern.structural.component.demo1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> componentList;

    private String name;

    public Folder(String name) {
        this.name = name;
        componentList = new ArrayList<>();
    }

    @Override
    public void add(Component c) {
        componentList.add(c);
    }

    @Override
    public void remove(Component c) {
        componentList.remove(c);
    }

    @Override
    public Component get(int i) {
        return componentList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("开始对" + name + "文件夹进行杀毒...");
        for (Component c : componentList) {
            c.killVirus();
        }
    }
}
