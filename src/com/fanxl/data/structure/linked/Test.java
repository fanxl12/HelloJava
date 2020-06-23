package com.fanxl.data.structure.linked;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        MySingleLinked<String> linked = new MySingleLinked<>();
        linked.add("111");
        linked.add("115");
        linked.addFirst("110");
        linked.add(1, "114");
        linked.addLast("120");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }
    }

}
