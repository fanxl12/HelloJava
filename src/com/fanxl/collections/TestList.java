package com.fanxl.collections;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/17 19:07
 */
public class TestList {

    public static boolean isContain(List<IpRange> srcList, List<IpRange> dstList) {
        for (IpRange src : srcList)  {
            // 90 - 100
            List<IpRange> lastList = new ArrayList<>();
            for (IpRange dst : dstList)  {
                if (src.getStart() <= dst.getStart()) {
                    if (src.getEnd() >= dst.getEnd()) {
                        // 完全包含 30 -40
                    } else {
                        // 20 - 30
                        if (dst.getEnd() > src.getEnd()) {
                            lastList.add(dst);
                        } else {
                            lastList.add(new IpRange(src.getEnd(), dst.getEnd()));
                        }
                    }
                } else {
                    // 20 - 30
                    if (dst.getEnd() < src.getStart()) {
                        lastList.add(dst);
                    } else if (dst.getEnd() <= src.getEnd()) {
                        lastList.add(new IpRange(dst.getStart(), src.getStart()));
                    } else {
                        lastList.add(new IpRange(src.getEnd(), dst.getEnd()));
                    }
                }
            }
            // 没有剩余的，说明完全匹配完了
            if (lastList.size() == 0) {
                dstList = new ArrayList<>();
                break;
            } else {
                // 把剩余未匹配完的，继续查找
                dstList = new ArrayList<>(lastList);
            }
        }
        return dstList.size() == 0;
    }


    public static void main(String[] args) {
        List<IpRange> srcList = new ArrayList<>();
        srcList.add(new IpRange(5, 10));
        srcList.add(new IpRange(20, 50));

        List<IpRange> dstList = new ArrayList<>();
        dstList.add(new IpRange(20, 30));
//        dstList.add(new IpRange(10, 60));
        boolean hasContain = isContain(srcList, dstList);
        if (hasContain) {
            System.out.println("srcList包含dstList");
        } else {
            System.out.println("srcList不包含dstList");
        }
    }
}
