package com.xiaoyang;

import java.util.Arrays;

public class NextLargerArray {
    public static void nextPermutation(int[] nums) {
        if (nums.length == 0) return;
        int index = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                index = i-1;
                int lowest = i;
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[index] < nums[j]) {
                        lowest = j;
                        break;
                    }
                }
                int value = nums[index];
                nums[index] = nums[lowest];
                nums[lowest] = value;
                index = i;
                break;
            }
        }
        Arrays.sort(nums, index, nums.length);
    }

    public static void main(String[] args) {
        int[] source = {4,2,0,2,3,2,0};
        nextPermutation(source);
    }
}
