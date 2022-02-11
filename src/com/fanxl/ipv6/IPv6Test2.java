package com.fanxl.ipv6;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/20 17:50
 */
public class IPv6Test2 {

    public static void main(String[] args) {
//        System.out.println(IPv6Utils.getFullIPv6("2::f"));
//        System.out.println(IPv6Utils.getFullIPv6("2::10"));
//        System.out.println(IPv6Utils.getFullIPv6("2::1000"));
//
//        System.out.println(IPv6Utils.getBigInteger("2::f").toString());
//        System.out.println(IPv6Utils.getBigInteger("2::000f").toString());
//        System.out.println(IPv6Utils.getBigInteger("2::10").toString());
//        System.out.println(IPv6Utils.getBigInteger("2::0010").toString());
//        System.out.println(IPv6Utils.getBigInteger("2::1000").toString());

//        String dstOrSrcIp = "all(0:0:0:0:0:0:0:0-ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff)";
//        System.out.println(dstOrSrcIp.substring(dstOrSrcIp.indexOf("(") + 1, dstOrSrcIp.indexOf(")")));
        List<HashMap<String, String>> infoList = new ArrayList<>();

        HashMap<String, String> one = new HashMap<>();
        one.put("primary-policy-hit-ipv6", "primary-policy-hit-ipv6");
        one.put("primary-policy-suggest-ipv6", "primary-policy-hit-ipv6");
        infoList.add(one);

        HashMap<String, String> two = new HashMap<>();
        two.put("primary-policy-hit", "primary-policy-hit-ipv6");
        two.put("primary-policy-suggest", "primary-policy-hit-ipv6");
        infoList.add(two);

        Map<String, List<HashMap<String, String>>> map = new HashMap<>();
        map.put("192.168.1.1", infoList);
        for (Map.Entry<String, List<HashMap<String, String>>> entry : map.entrySet()) {
            List<HashMap<String, String>> ll = entry.getValue().stream().sorted(new Comparator<HashMap<String, String>>() {
                @Override
                public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
                    for (String key : o2.keySet()) {
                        if (key.endsWith("-ipv6")) {
                            return -1;
                        }
                    }
                    return 1;
                }
            }).collect(Collectors.toList());
            map.put(entry.getKey(), ll);
        }

//        infoList = infoList.stream().sorted(new Comparator<HashMap<String, String>>() {
//            @Override
//            public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
//                for (String key : o2.keySet()) {
//                    if (key.endsWith("-ipv6")) {
//                        return -1;
//                    }
//                }
//                return 1;
//            }
//        }).collect(Collectors.toList());
        System.out.println(map.size());
    }
}
