package com.fanxl.data.structure.array;

/**
 * @description
 * @author: fanxl
 * @date: 2019/1/23 0023 21:58
 */
public class Test {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        for (int i =0; i < 9; i++) {
            array.addLast(i);
        }
        System.out.println(array.toString());
        array.addLast(100);
        array.addLast(120);
        System.out.println(array.toString());
        array.remove(2);
        System.out.println(array.toString());
        array.removeElement(7);
        System.out.println(array.toString());
    }

}
