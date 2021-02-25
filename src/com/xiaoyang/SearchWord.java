package com.xiaoyang;

public class SearchWord {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int m = 0;
        int n = nums.length-1;
        while (m <= n) {
            int mid = (m+n) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[0]) {
                if (nums[mid] >= target && nums[0] <= target) {
                    n = mid - 1;
                } else {
                    m = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[n] >= target) {
                    m = mid + 1;
                } else {
                    n = mid - 1;
                }
            }
        }
        return -1;
    }
}
