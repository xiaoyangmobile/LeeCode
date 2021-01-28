package com.xiaoyang;

public class MaxArea {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int value1 = height[i] > height[j]? height[j] : height[i];
                int value2 = j - i;
                int value = value1 * value2;
                if (value > area) {
                    area = value;
                }
            }
        }
        return area;
    }
}
