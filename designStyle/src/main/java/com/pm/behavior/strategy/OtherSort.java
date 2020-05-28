package com.pm.behavior.strategy;

/**
 * @author pengcheng
 * @version V1.0
 * @description 另外一种排序方式
 * @date 2019/03/26 15:05
 */
public class OtherSort implements Sort {
    public int[] sort(int[] arr) {
        System.out.println("另外一种排序");
        return arr;
    }
}
