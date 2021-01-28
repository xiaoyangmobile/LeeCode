package com.xiaoyang;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumSum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 100000;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i  > 0  && nums[i] == nums[i-1]) {
                continue;
            }
            int k = i+1;
            int j = nums.length-1;
            while (k < j) {
                int value = nums[i] + nums[k] + nums[j];
                if (value == target) return target;
                if (Math.abs(target - value) < Math.abs(target - result)) {
                    result = value;
                }
                if (value - target > 0) {
                    j -= 1;
                } else {
                    k += 1;
                }
            }
        }
        return  result;
    }
}
