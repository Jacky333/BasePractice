package com.pm.algorithm;

import java.util.Arrays;

/**
 * @author pengcheng
 * @version V1.0
 * @description 插入排序
 * 一，插入排序介绍
 *
 *  插入排序是基于比较的排序。所谓的基于比较，就是通过比较数组中的元素，看谁大谁小，根据结果来调整元素的位置。
 *
 * 因此，对于这类排序，就有两种基本的操作：①比较操作； ②交换操作
 *
 * 其中，对于交换操作，可以优化成移动操作，即不直接进行两个元素的交换，还是用一个枢轴元素(tmp)将当前元素先保存起来，然后执行移动操作，待确定了最终位置后，再将当前元素放入合适的位置。（下面的插入排序就用到了这个技巧）--因为，交换操作需要三次赋值，而移动操作只需要一次赋值！
 *
 * 有些排序算法，比较次数比较多，而移动次数比较少，而有些则相反。比如，归并排序和快速排序，前者移动次数比较多，而后者比较次数比较多。
 *
 *
 *
 * 这里主要介绍插入排序
 *
 *
 *
 * 二，插入排序算法分析
 *
 * 插入排序算法有种递归的思想在里面，它由N-1趟排序组成。初始时，只考虑数组下标0处的元素，只有一个元素，显然是有序的。
 *
 * 然后第一趟 对下标 1 处的元素进行排序，保证数组[0,1]上的元素有序；
 *
 * 第二趟 对下标 2 处的元素进行排序，保证数组[0,2]上的元素有序；
 *
 * .....
 *
 * .....
 *
 * 第N-1趟对下标 N-1 处的元素进行排序，保证数组[0,N-1]上的元素有序，也就是整个数组有序了。
 *
 * 它的递归思想就体现在：当对位置 i 处的元素进行排序时，[0,i-1]上的元素一定是已经有序的了。
 * @date 2020/05/28 17:39
 */
public class InsertSort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int insertValue = array[i];
            int j = i - 1;
            //从右向左比较元素的同时，进行元素复制
            for (; j >= 0 && insertValue < array[j]; j--) {
                array[j + 1] = array[j];
            }
            //insertValue的值插入适当位置
            array[j + 1] = insertValue;
        }

    }

    public static void main(String[] args) {
        int array[] = new int[]{3, 89, 15, 25, 6,3};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
