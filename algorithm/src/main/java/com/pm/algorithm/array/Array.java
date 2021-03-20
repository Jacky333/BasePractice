package com.pm.algorithm.array;

import java.util.Arrays;

/**
 * @author pengcheng
 * @version V1.0
 * @description 实现一个支持动态扩容的数组
 * @date 2021/03/19 17:12
 */
public final class Array<T> {
    //设定初始大小
    private static final int init_size = 8;

    //存放值的数组
    private Object[] objectArray;

    private int size;

    public Array() {
        objectArray = new Object[init_size];
    }

    Array(int size) {
        if (size < 0) {
            throw new RuntimeException("数组大小不能小于等于0");
        }
        if (size <= 8) {
            size = init_size;
        }
        objectArray = new Object[size];
    }

    private void setSize(int size) {
        if (size <= 0) {
            throw new RuntimeException("数组大小不能小于等于0");
        }
        if (size < objectArray.length) {
            throw new RuntimeException("数组大小不能小于原数组");
        }
        if (size == objectArray.length) {
            return;
        }
        Object[] array = new Object[size];
        for (int i = 0; i < objectArray.length; i++) {
            Object o = objectArray[i];
            array[i] = o;
        }
        objectArray = array;
    }

    public T get(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("数组角标越界");
        }
        return (T) objectArray[index];
    }

    public void add(T t) {
        if (this.size > objectArray.length) {
            throw new RuntimeException("出大问题了");
        }
        if (this.size == objectArray.length) {
            setSize(2 * objectArray.length);
        }
        objectArray[size++] = t;
    }

    public static void main(String[] args) {
        Array<Object> array = new Array<>();
        System.out.println(array.size);
    }

}
