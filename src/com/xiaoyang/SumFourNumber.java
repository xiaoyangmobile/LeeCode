package com.xiaoyang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumFourNumber {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i+1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length -1; k++) {
                    if (k > j + 1 && nums[k] == nums[k-1]) {
                        continue;
                    }
                    for (int n = k + 1; n < nums.length; n++) {
                        if (n > k + 1 && nums[n] == nums[n-1]) {
                            continue;
                        }
                        if (nums[i] + nums[j] + nums[k] + nums[n] == target) {
                            List<Integer> result = new ArrayList<>();
                            result.add(nums[i]);
                            result.add(nums[j]);
                            result.add(nums[k]);
                            result.add(nums[n]);
                            list.add(result);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = { -2,-1,-1,1,1,2,2 };
        fourSum(a, 0);
    }
}
