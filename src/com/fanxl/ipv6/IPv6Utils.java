package com.fanxl.ipv6;

import sun.net.util.IPAddressUtil;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/9 16:13
 */
public class IPv6Utils {

    /**
     * 是否是合法的IPv6地址 官方内置方法实现
     * @param ipv6Str
     * @return
     */
    public static boolean isisIPv6LiteralAddress(String ipv6Str) {
        return IPAddressUtil.isIPv6LiteralAddress(ipv6Str);
    }

    /**
     * 获取标准的IPv6地址格式，由于IPv6
     * @param ipv6Str
     * @return
     */
    public static String getFullIPv6(String ipv6Str) {
        try {
            InetAddress inetAddress =InetAddress.getByName(ipv6Str);
            return inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取 BigInteger
     * @param ipv6Str
     * @return
     */
    public static BigInteger getBigInteger(String ipv6Str) {
        try {
            return new BigInteger(1, InetAddress.getByName(ipv6Str).getAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return new BigInteger(String.valueOf(0L));
    }

}
