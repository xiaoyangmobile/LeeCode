package com.xiaoyang;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstMisPositive {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.get(i) == null) {
                return i;
            }
        }
        return nums.length+1;
    }
}
