package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/10/18 10:12
 */
public class NumberRange {

    public static void main(String[] args) {
        String str = "1990\n2010\n2017";
        // 这里应用了 (?m) 的多行匹配模式，只为方便我们测试输出
        // "^1990$|^199[1-9]$|^20[0-1][0-6]$|^2017$" 为判断 1990-2017 正确的正则表达式
        Pattern pattern = Pattern.compile("(?m)^1990$|^199[1-9]$|^20[0-1][0-6]$|^2017$");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
