package com.xiaoyang;

public class THREE_NoRepeatString {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));
            int index = current.indexOf(value);
            if (index != -1) {
                if (maxLength < current.length()) {
                    maxLength = current.length();
                }
                if (index != current.length() - 1) {
                    current = current.substring(index + 1);
                } else {
                    current = "";
                }
            }
            current += value;
            System.out.println(current);
        }
        if (maxLength < current.length()) {
            maxLength = current.length();
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int count = lengthOfLongestSubstring("abcdefaghi");
        System.out.println(count);
    }
}
