package com.xiaoyang;

public class FortyTwo_JYS {
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0;
            for (int j = i-1; j >= 0; j--) {
                if (height[j] > leftMax) {
                    leftMax = height[j];
                }
            }
            int rightMax = 0;
            for (int j = i+1; j < height.length; j++) {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                }
            }
            int min = Math.min(leftMax, rightMax);
            if (height[i] < min) {
                sum += (min - height[i]);
            }
        }
        return sum;
    }
}
