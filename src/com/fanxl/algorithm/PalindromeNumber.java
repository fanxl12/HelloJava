package com.fanxl.algorithm;

/**
 * @author fanxl12 回文数
 * @description https://leetcode-cn.com/problems/palindrome-number/
 * @date 2019/11/22 11:03
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        int n = str.length();
        for (int i = 0; i < n; i++) {
            //  1  2  3  2  1
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int y = 0;
        while ( x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return temp == y;
    }



    public static void main(String[] args) {
        System.out.println(PalindromeNumber.isPalindrome(12210));
        System.out.println(PalindromeNumber.isPalindrome2(1221));
    }

}
