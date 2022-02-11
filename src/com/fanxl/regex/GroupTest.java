package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description: group是针对（）来说的，group（0）就是指的整个串，group（1） 指的是第一个括号里的东西，group（2）指的第二个括号里的东西
 * @author: fanxiaole
 * @date: 2021/10/18 10:05
 */
public class GroupTest {

    public static void main(String[] args) {
        String regEx = "count(\\d+)(df)";
        String s = "count000dfdfsdffaaaa1";
        Pattern pat = Pattern.compile(regEx);
        Matcher mat = pat.matcher(s);
        if(mat.find()){
            // count000df
            System.out.println(mat.group(0));
            // 000
            System.out.println(mat.group(1));
            // df
            System.out.println(mat.group(2));
        }

        String regEx1 = "count\\d+";
        Pattern pat1 = Pattern.compile(regEx1);
        Matcher mat1 = pat1.matcher(s);
        if(mat1.find()){
            // 匹配结果
            System.out.println(mat1.group());
        }
    }


}
