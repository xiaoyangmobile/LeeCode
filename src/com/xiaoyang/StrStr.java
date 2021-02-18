package com.xiaoyang;

public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0)
            return 0;
        for (int i = 0; i < haystack.length() - needle.length() +1 ; i++) {
            boolean fond = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    fond = false;
                    break;
                }
            }
            if (fond) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        strStr("hello", "ll");
    }
}
