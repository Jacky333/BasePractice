package com.pm.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author pengcheng
 * @version V1.0
 * @description 两数只和
 * 题目描述
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @date 2020/05/29 15:36
 */
public class TwoSum {
    public static List<Integer> twoSum(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (Integer num : map.keySet()) {
            int another = target - num;
            if (map.containsKey(another) && another != num) {
                list.add(map.get(num));
                list.add(map.get(another));
                break;
            }

        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        System.out.println(twoSum(nums, target));
    }
}
