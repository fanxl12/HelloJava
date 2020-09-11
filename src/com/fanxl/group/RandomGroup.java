package com.fanxl.group;

import java.util.ArrayList;
import java.util.List;

public class RandomGroup {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 9; i > 0; i--) {
            list.add(i + "");
        }
        // 10 4 3 3
        // 8 3 3 2
//        Collections.shuffle(list);
        // 3 2 2 2
        int group = 4;
        int last = list.size() % group;
        int eachGroupNumber = list.size() / group;
        System.out.println("总数量:" + list.size() + " 共分:" + group + "组， 每组:" + eachGroupNumber + "人" +  " 多余数量:" + last);
        int start;
        int end = 0;
        int totalAdd = 0;
        for (int i = 0; i < group; i++) {
            start = end;
            end = (i + 1) * eachGroupNumber + totalAdd;
            if (i < last) {
                totalAdd += i + 1;
                end += i + 1;
            }
            System.out.println("start:" + start + "--end:" + end + "人数:" + (end - start));
        }

        List<List<String>> groupList = new ArrayList<>();
        int index = 0;
        for (int j =0; j < eachGroupNumber; j++) {

            for (int i = 0; i < group; i++) {
                index = j * group + i;
                System.out.println("组:" + i + "添加数据:" + list.get(index));
//                List<String> item = groupList.get(i);
//                if (item == null) {
//                    item = new ArrayList<>();
//                    groupList.add(item);
//                }
            }
            System.out.println("--------------------");
        }

        for (int i = 0; i < last; i++) {
            index +=1;
            System.out.println("组:" + i + "添加数据:" + list.get(index));
        }


    }


}
