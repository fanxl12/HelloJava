package com.fanxl.group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i + "");
        }
        int groupNumber = 3;
        List<GroupIndex> groupIndexList = GroupUtils.getGroup(groupNumber, list.size());
        int maxEachGroupNumber = groupIndexList.get(0).getNumber();
        List<GroupComponent> groupList = new ArrayList<>();
        for (int i=0; i<groupIndexList.size(); i++) {
            groupList.add(new Group("第" + (i+1) + "组"));
        }
        int index;
        for (int j =0; j<maxEachGroupNumber; j++) {
            for (int i=0; i<groupList.size(); i++) {
                index = j * groupNumber + i;
                if (index > (list.size() - 1)) {
                    break;
                }
                // 添加数据
                GroupComponent group = groupList.stream()
                        .filter(item -> !item.isAdd())
                        .min(Comparator.comparing(GroupComponent::sum))
                        .get();

                System.out.println("index:" + index);
                String item = list.get(index);
                group.add(new GroupLeaf("学生" + index, Integer.parseInt(item)));
            }

            for (GroupComponent item : groupList) {
                Group group = (Group) item;
                group.setAdd(false);
            }
        }

        groupList.sort(Comparator.comparingInt(GroupComponent::childNumber).reversed());

        for (GroupComponent item : groupList) {
            Group group = (Group) item;
            group.sumTotal();
        }


    }

}
