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

    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("add failed. Array is full.");
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed. required index >=0 and index <=size.");
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = e;
        size ++;
    }

    public int get(int index) {
        if (index <0 || index >= size) {
            throw new IllegalArgumentException("Get failed. index is illegal.");
        }
        return data[index];
    }

    public void set(int index, int e) {
        if (index <0 || index >= size) {
            throw new IllegalArgumentException("Get failed. index is illegal.");
        }
        data[index] = e;
    }

    public boolean contains(int e) {
        for (int i=0; i< size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int remove(int index) {
        int temp = get(index);
        for (int i=index; i<size; i++) {
            data[i] = data[i+1];
        }
        size--;
        return temp;
    }

    public int removeFirst() {
        return remove(0);
    }

    public int removeLast() {
        return remove(size - 1);
    }

    public void removeElement(int e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public int find(int e) {
        for (int i=0; i< size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("Array: size=%d, capacity=%d\n", size, getCapacity()));
        stringBuffer.append("[");
        for (int i=0; i<size; i++) {
            stringBuffer.append(data[i]);
            if (i != size-1) {
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
