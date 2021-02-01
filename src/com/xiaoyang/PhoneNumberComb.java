package com.xiaoyang;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberComb {
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        int i = 0;
        List<String> list = new ArrayList<>();
        while (i < digits.length()) {
            System.out.println(digits.charAt(i));
            String letters = getLetters(Integer.valueOf(String.valueOf(digits.charAt(i))));
            if (list.size() == 0) {
                for (int j = 0; j < letters.length(); j++) {
                    list.add(String.valueOf(letters.charAt(j)));
                }
            } else {
                List<String> current = new ArrayList<>();
                for (int j = 0; j < list.size(); j++) {
                    for (int k = 0; k < letters.length(); k++) {
                        current.add(list.get(j) + letters.charAt(k));
                    }
                }
                list = current;
            }
            i++;
        }
        return list;
    }

    public static String getLetters(int index) {
        System.out.println(index);
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int start, end;
        if (index == 7) {
            start = 3*5;
            end = start + 4;
        } else
        if (index == 8) {
            start = 3*6 + 1;
            end = start + 3;
        } else
        if (index == 9) {
            start = 3*7 + 1;
            end = start + 4;
        } else {
            start = 3*(index-2);
            end = start + 3;
        }
        System.out.println(start);
        System.out.println(end);
        return abc.substring(start, end);
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("5"));
    }
}

