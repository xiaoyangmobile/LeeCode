package com.xiaoyang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubString {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (words.length <= 0) return list;
        int wordLength = words[0].length();
        int subStringLength = words.length * wordLength;
        HashMap<String, Integer> source = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (source.get(words[i]) == null) {
                source.put(words[i], 1);
            } else {
                source.put(words[i], source.get(words[i]) + 1);
            }
        }
        a: for (int i = 0; i < s.length() - subStringLength + 1; i++) {
            HashMap<String, Integer> target = new HashMap<>();
            String subString = s.substring(i, i + subStringLength);
            int count = 0;
            for (int j = 0; j < subString.length(); j += wordLength) {
                String index = s.substring(i + j, i + j+wordLength);
                if (source.get(index) == null) {
                    continue a;
                } else {
                    if (target.get(index) == null) {
                        target.put(index, 1);
                        ++count;
                    } else {
                        int num = target.get(index);
                        if (num >= source.get(index)) {
                            continue a;
                        } else {
                            target.put(index, ++num);
                            ++count;
                        }
                    }
                }
            }
            if (count == words.length) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] input = {"word","good","best","word"};
        findSubstring("wordgoodgoodgoodbestword", input);
    }
}
