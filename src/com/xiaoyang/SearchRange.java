package com.xiaoyang;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            if (left > right) {
                break;
            }
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] == target) {
                left = mid;
                while ((left - 1 >= 0) && nums[left -1] == target) {
                    left = left-1;
                }
                right = mid;
                while ((right+1 < nums.length) && nums[right + 1] == target) {
                    right = right + 1;
                }
                return new int[]{left, right};
            }
        }
        return new int[] {-1, -1};
    }
}
