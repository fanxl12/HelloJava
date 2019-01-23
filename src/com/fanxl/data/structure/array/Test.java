package com.fanxl.data.structure.array;

/**
 * @description
 * @author: fanxl
 * @date: 2019/1/23 0023 21:58
 */
public class Test {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.addLast(10);
        array.addLast(1);
        array.addLast(3);
        array.addLast(9);
        array.add(2, 5);
        System.out.println(array.toString());
        array.remove(2);
        System.out.println(array.toString());
        array.removeElement(9);
        System.out.println(array.toString());
    }

}
