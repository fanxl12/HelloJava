package com.fanxl.group;

public abstract class GroupComponent {

    protected String name;

    public abstract void add(GroupComponent c);

    public abstract GroupComponent get(int i);

    public abstract int sum();

    public abstract boolean isAdd();

    public abstract int childNumber();

    public String getName() {
        return name;
    }
}
