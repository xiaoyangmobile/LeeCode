package com.xiaoyang;

public class RevertInt {
    public static int revert(int x) {
        int result = 0;
        while (x != 0) {
            int value = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE && value > Integer.MAX_VALUE)) {
                return 0;
            } else if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && value < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            result = result * 10 + value;
        }
        return result;
    }
}

