package com.xiaoyang;

import java.util.HashMap;
import java.util.Map;

public class Summation {
    static int[] nums = {2, 7, 11, 15};
    static int target = 10;
    public static int[] solution1(int[] nums, int target) throws Exception {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                result[0] = map.get(value);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        throw new Exception("There's no result!");
    }

    public static int[] solution2(int[] nums, int target) throws Exception {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new Exception("There's no result");
    }

    public static void main(String[] args) {
        try {
            int[] result1 = solution1(nums, target);
            int[] result2 = solution2(nums, target);
            for (int index: result1) {
                System.out.println(index);
            }
            for (int index: result2) {
                System.out.println(index);
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
