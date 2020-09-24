package com.fanxl.group;

import java.util.ArrayList;
import java.util.List;

public class Group extends GroupComponent {

    private int sum;

    protected boolean add;

    private List<GroupComponent> componentList;

    public Group(String name) {
        this.name = name;
        componentList = new ArrayList<>();
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    @Override
    public void add(GroupComponent c) {
        componentList.add(c);
        sum += c.sum();
        add = true;
    }

    @Override
    public GroupComponent get(int i) {
        return componentList.get(i);
    }

    @Override
    public int sum() {
        return sum;
    }

    public int sumTotal() {
        System.out.println("小组:" + name);
        int sum = 0;
        for (GroupComponent item : componentList) {
            sum += item.sum();
        }
        System.out.println("总分:" + sum);
        return sum;
    }

    @Override
    public boolean isAdd() {
        return add;
    }

    @Override
    public int childNumber() {
        return componentList.size();
    }
}
