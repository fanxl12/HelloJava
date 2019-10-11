package com.fanxl.algorithm;

/**
 * @author fanxl12
 * @description 整数反转 https://leetcode-cn.com/problems/reverse-integer/
 * -2147483648 ~ 2147483647
 * @date 2019/9/5 11:03
 */
public class ReverseInteger {

    public int reverse(int x) {
        //如果不做这个判断，下面的x=-x将会报错
        if (x == -2147483648) {
            return 0;
        }
        if (x < 0) {
            return -reverse(-x);
        }
        int res = 0;
        while (x != 0) {
            // 处理溢出
            if (res > 214748364) {
                //1463847412
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        // 如果溢出就返回0
        return res <= 0x7fffffff ? res : 0;
    }

    public static void main(String[] args) {
        ReverseInteger ii = new ReverseInteger();
        System.out.println(ii.reverse(1563847412));
    }


}
