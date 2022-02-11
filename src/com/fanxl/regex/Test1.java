package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/10/18 9:47
 */
public class Test1 {

    public static void main(String[] args) {
        String re1 = "my name is 范范";

        // 匹配中文
        Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]+");
        Matcher matcher = pattern.matcher(re1);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
