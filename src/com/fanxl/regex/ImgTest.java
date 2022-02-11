package com.fanxl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: fanxiaole
 * @date: 2021/10/18 10:17
 */
public class ImgTest {

    public static void main(String[] args) {
        String str = "<img  src='aaa.jpg' /><img src=bbb.png/><img src=\"ccc.png\"/>" +
                "<img src='ddd.exe'/><img src='eee.jpn'/>";
        // 这里我们考虑了一些不规范的 img 标签写法，比如：空格、引号
        Pattern pattern = Pattern.compile("<img\\s+src=(?:['\"])?(\\w+.(jpg|png))(?:['\"])?\\s*/>");
        // ?<name> 将小括号中匹配的内容保存为一个名字为 name 的副本 然后下面 matcher.group("name") 来取出数据
//        Pattern pattern = Pattern.compile("<img\\s+src=(?:['\"])?(?<src>\\w+.(jpg|png) )(?:['\"])?\\s*/>");
        // ?: 表示仅分组 不创建反向引用
//        Pattern pattern = Pattern.compile("<img\\s+src=(.*)\\s*/>");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
//            System.out.println(matcher.group("src"));
            System.out.println(matcher.group(1));
        }
    }

}
