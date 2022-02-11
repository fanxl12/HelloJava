package com.fanxl.ipv6;

import sun.net.util.IPAddressUtil;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/30 14:54
 */
public class IPv6Test3 {
    public static void main(String[] args) {
        System.out.println(IPAddressUtil.isIPv6LiteralAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }
}
