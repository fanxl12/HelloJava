package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: 贪婪与非贪婪模式的匹配
 * @author: fanxiaole
 * @date: 2021/10/18 10:46
 */
public class Test2 {

    public static void main(String[] args) {
        String str = "<div>文章标题</div><div>发布时间</div>";
        // 贪婪模式
        Pattern pattern = Pattern.compile("<div>(?<title>.+)</div>");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group("title"));
        }

        System.out.println("--------------");

        // 非贪婪模式
        pattern = Pattern.compile("<div>(?<title>.+?)</div>");
        matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group("title"));
        }
    }

}
