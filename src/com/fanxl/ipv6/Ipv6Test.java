package com.fanxl.ipv6;

import sun.net.util.IPAddressUtil;

import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.ByteBuffer;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/12/9 15:29
 */
public class Ipv6Test {

    /**
     * 字符串转换为16进制字符串
     *
     * @param s
     * @return
     */
    public static String stringToHexString(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }

    private static String bytesToHexString(byte[] bArray) {
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String ip1 = "0:0:0:0:0:0:874b:2b34";
        // 303A303A303A303A303A303A383734623A32623334000000000000000000000000000000000000
        // 303a303a303a303a303a303a383734623a32623334
        System.out.println(stringToHexString(ip1));
        String ip2 = "2001:0db8:85a3:08d3:1319:8a2e:0370:7344";
        System.out.println(IPv6Utils.getFullIPv6(ip1));
        System.out.println(IPv6Utils.getFullIPv6(ip2));
        BigInteger ipNum1 = new BigInteger(1, InetAddress.getByName(ip1).getAddress());
        BigInteger ipNum2 = new BigInteger(1, InetAddress.getByName(ip2).getAddress());
        System.out.println(ipNum1.compareTo(ipNum2) > 0 ? "ip1 > ip2" : "ip1 <= ip2");

        String ip3 = "2001:3CA1:010F:001A:121B:0000:0000:0010";
        // 323030313A334341313A303130463A303031413A313231423A303030303A303030303A30303130
        System.out.println(stringToHexString(ip3));
        BigInteger ipNum3 = new BigInteger(1, InetAddress.getByName(ip3).getAddress());
        System.out.println(ipNum3.toString());
        System.out.println(ipNum3.compareTo(ipNum1) > 0 ? "ip3 > ip1" : "ip3 <= ip1");
        System.out.println(ipNum3.compareTo(ipNum2) > 0 ? "ip3 > ip2" : "ip3 <= ip2");
        // ip1 < ip2 < ip3

        InetAddress inetAddress = InetAddress.getByName(ip3);
        byte[] bytes = inetAddress.getAddress();

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getLong());

    }

}
