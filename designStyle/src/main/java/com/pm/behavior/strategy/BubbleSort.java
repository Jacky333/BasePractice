package com.pm.behavior.strategy;

/**
 * @author pengcheng
 * @version V1.0
 * @description 冒泡排序
 * @date 2019/03/26 14:25
 */
public class BubbleSort implements Sort {
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
