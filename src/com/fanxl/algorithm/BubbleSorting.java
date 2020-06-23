package com.fanxl.algorithm;

/**
 * @author fanxl12
 * @description 冒泡排序
 * @date 2019/6/17 14:53
 */
public class BubbleSorting {

    public static void main(String[] args) {
        int[] nums = {5, 11, 8, 1, 4, 6, 3, 0, 2, 7, 9};
        int[] nums2 = {5, 4, 3, 1};
        BubbleSorting sb = new BubbleSorting();
        int[] result = sb.sortArray(nums);
        sb.getResult(result);
    }

    private void getResult(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public int[] sortArray(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            boolean sorted = true;
            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
            getResult(nums);
            System.out.println("第" + (i+1) + "轮");
        }
        return nums;
    }

    // 冒泡排序：超时
    public int[] sortArray2(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            // 先默认数组是有序的，只要发生一次交换，就必须进行下一轮比较，
            // 如果在内层循环中，都没有执行一次交换操作，说明此时数组已经是升序数组
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
