package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/10/18 10:51
 */
public class UrlTest {

    public static void main(String[] args) {
        String regex = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
        String str = "https://ww.baidu.co";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
