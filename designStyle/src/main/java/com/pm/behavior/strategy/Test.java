package com.pm.behavior.strategy;

import java.util.Arrays;

/**
 * @author pengcheng
 * @version V1.0
 * @description 测试类
 * @date 2019/03/26 14:52
 */
public class Test {
    public static void main(String[] args) {
        Sort sort = new SelectSort();
//        Sort sort = new OtherSort();
        ArrayHandler arrayHandler = new ArrayHandler(sort);
        int[] arr = {1, 8, 84, 3, 5, 6};
        arrayHandler.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
