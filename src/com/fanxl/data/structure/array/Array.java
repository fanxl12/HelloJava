package com.fanxl.data.structure.array;

/**
 * @description 自定义动态数组
 * @author: fanxl
 * @date: 2019/1/23 0023 21:31
 */
public class Array<T> {

    /**
     * 数组的元素个数
     */
    private int size;

    private T[] data;

    public Array(int capacity) {
        data = (T[]) new Object[capacity];
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

    public void addLast(T e) {
        add(size, e);
    }

    public void addFirst(T e) {
        add(0, e);
    }

    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed. required index >=0 and index <=size.");
        }
        if (size == data.length) {
            resize(2 * data.length);
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = e;
        size ++;
    }

    private void resize(int capacity) {
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0 ; i < size; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public T get(int index) {
        if (index <0 || index >= size) {
            throw new IllegalArgumentException("Get failed. index is illegal.");
        }
        return data[index];
    }

    public void set(int index, T e) {
        if (index <0 || index >= size) {
            throw new IllegalArgumentException("Get failed. index is illegal.");
        }
        data[index] = e;
    }

    public boolean contains(T e) {
        for (int i=0; i< size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public T remove(int index) {
        T temp = get(index);
        for (int i=index + 1; i<size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 2) {
            resize(data.length / 2);
        }

        return temp;
    }

    public T removeFirst() {
        return remove(0);
    }

    public T removeLast() {
        return remove(size - 1);
    }

    public void removeElement(T e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    public int find(T e) {
        for (int i=0; i< size; i++) {
            if (data[i].equals(e)) {
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
