package com.pm.algorithm.sort;

import java.util.Arrays;

/**
 * @author pengcheng
 * @version V1.0
 * @description 归并排序
 * @date 2020/05/29 14:57
 */
public class MergeSort {
    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            //折半成两个小集合，分别进行递归
            int middle = start + (end - start) /2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            //把两个有序小集合，归并成一个大集合
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        //开辟额外大集合，设置指针
        int[] tempArray = new int[end - start + 1];
        int p1 = start, p2 = middle + 1, p = 0;
        //比较两个小集合的元素，依次放入大集合
        while (p1 <= middle && p2 <= end) {
            if (array[p1] <= array[p2]) {
                tempArray[p++] = array[p1++];
            } else {
                tempArray[p++] = array[p2++];
            }
        }
        //左侧小集合还有剩余，依次放入大集合尾部
        while (p1 <= middle) {
            tempArray[p++] = array[p1++];
        }
        //右侧小集合还有剩余，依次放入大集合尾部
        while (p2 <= end) {
            tempArray[p++] = array[p2++];
        }
        //把大集合的元素复制回原数组
        for (int i = 0; i < tempArray.length; i++) {
            array[i + start] = tempArray[i];
        }
    }

    public static void main(String[] args) {
        int array[] = new int[]{89, 15, 25, 6, 3};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
