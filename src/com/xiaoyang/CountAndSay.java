package com.xiaoyang;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return 1 + "";
        }
        String str = countAndSay(n-1);
        return convert(str);
    }

    public static String convert(String str) {
        if (str.length() == 1) {
            return "11";
        }
        String result = "";
        char letter = ' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char newLetter = str.charAt(i);
            if (letter == newLetter) {
                count++;
            } else {
                if (i != 0) {
                    result += (String.valueOf(count) + letter);
                }
                letter = newLetter;
                count = 1;
            }
        }
        result += ((count + "") + letter);
        return result;
    }

    public static void main(String[] args) {
        countAndSay(4);
    }
}
