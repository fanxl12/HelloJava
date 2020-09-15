package com.fanxl.group;

import java.util.ArrayList;
import java.util.List;

public class GroupUtils {

    public static List<GroupIndex> getGroup(int group, int total) {
        int last = total % group;
        int eachGroupNumber = total / group;
        System.out.println("总数量:" + total + " 共分:" + group + "组， 每组:" + eachGroupNumber + "人" +  " 多余数量:" + last);
        int start;
        int end = 0;
        int totalAdd = 0;
        List<GroupIndex> groupIndexList = new ArrayList<>();
        for (int i = 0; i < group; i++) {
            start = end;
            end = (i + 1) * eachGroupNumber + totalAdd;
            if (i < last) {
                totalAdd += 1;
                end += 1;
            }
            if (end > total) {
                end = total;
            }
            System.out.println("start:" + start + "--end:" + end + "人数:" + (end - start));
            groupIndexList.add(new GroupIndex(start, end));
        }
        return groupIndexList;
    }

}
