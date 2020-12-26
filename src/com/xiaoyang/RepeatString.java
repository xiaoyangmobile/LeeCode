package com.xiaoyang;

public class RepeatString {
    public static String get(String value) {
        int index = 0;
        int length = 0;
        for (int i = 0; i < value.length()-1; i++) {
            for (int j = (value.length()-1); j > i; j--) {
                boolean fond = false;
                for (int m = 0; m < (j - i + 1)/ 2; m++) {
                    System.out.println(i + ":" + j + " : " + m + ">" + value.charAt(i + m) + ":" + value.charAt(j - m));
                    if (value.charAt(i + m) != value.charAt(j - m)) {
                        fond = false;
                        break;
                    } else {
                        fond = true;
                    }
                }
                if (fond) {
                    if ((j - i) > length) {
                        length = j - i;
                        index = i;
                    }
                }
            }
        }
        return value.substring(index, index + length + 1);
    }

    public static void main(String[] args) {
        String result = get("a");
        System.out.println("...." + result);
    }
}