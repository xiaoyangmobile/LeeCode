package com.xiaoyang;

public class ZConvert {
    private static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int step = numRows * 2 - 2;
        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += step) {
                result += s.charAt(j);
                if (i != 0 && i != numRows -1) {
                    int cindex = j + (numRows - 1 - i) * 2;
                    if (cindex < s.length()) {
                        result += s.charAt(cindex);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        String result = convert(input, 3);
        System.out.println(result);
    }
}
