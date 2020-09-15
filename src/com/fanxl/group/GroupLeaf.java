package com.fanxl.group;

public class GroupLeaf extends GroupComponent {

    private int score;

    public GroupLeaf(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public void add(GroupComponent c) {
        throw new IllegalArgumentException("不支持此方法");
    }

    @Override
    public GroupComponent get(int i) {
        throw new IllegalArgumentException("不支持此方法");
    }

    @Override
    public int sum() {
        System.out.println("学生:" + name + "分数:" + score);
        return score;
    }

    @Override
    public boolean isAdd() {
        throw new IllegalArgumentException("不支持此方法");
    }

    @Override
    public int childNumber() {
        return 0;
    }
}
