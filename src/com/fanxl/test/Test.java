package com.fanxl.test;

import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");
        System.out.println(String.join(",", list));
    }
}