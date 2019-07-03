package com.fanxl.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanxl12
 * @description
 * @date 2019/6/17 14:53
 */
public class Add {

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 2, 3};
        Add add = new Add();
        int result = add.removeDuplicates(nums);
        System.out.println("长度:" + result);
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
