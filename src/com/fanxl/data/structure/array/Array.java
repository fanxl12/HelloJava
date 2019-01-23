package com.fanxl.data.structure.array;

/**
 * @description 自定义动态数组
 * @author: fanxl
 * @date: 2019/1/23 0023 21:31
 */
public class Array {

    /**
     * 数组的元素个数
     */
    private int size;

    private int[] data;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
