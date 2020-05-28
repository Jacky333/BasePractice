package com.pm.behavior.strategy;

/**
 * @author pengcheng
 * @version V1.0
 * @description 处理数组排序
 * @date 2019/03/26 14:49
 */
public class ArrayHandler {
    private Sort sort;

    public ArrayHandler(Sort sort) {
        this.sort = sort;
    }

    public int[] sort(int[] arr) {
        return sort.sort(arr);
    }
}
