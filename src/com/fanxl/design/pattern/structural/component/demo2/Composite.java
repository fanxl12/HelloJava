package com.fanxl.design.pattern.structural.component.demo2;

import java.util.ArrayList;

// 复合组件构建类，模拟某个组织部门
public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    // 构建一个容器，用来保存该节点下所有的“设备”和“组织”
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    // 该容器内部，递归查询depth深度的节点下的列表内容
    @Override
    public void display(int depth) {
        // 输出树形结构（根据depth深度模拟输出多少个-）
        for (int i = 0; i < depth; i++) {
            System.out.print("*");
        }
        System.out.println(getName());
        // 递归显示
        for(Component component: componentArrayList) {
            component.display(depth + 1);
        }
    }
}
