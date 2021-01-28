package com.xiaoyang;

public class IntToRoman {
    public static String convert(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }
        String result = "";
        int num1 = num / 1000;
        result += getRoman(num1, 1000);
        num = num % 1000;
        int num2 = num / 100;
        result += getRoman(num2, 100);
        num = num % 100;
        int num3 = num / 10;
        result += getRoman(num3, 10);
        int num4 = num % 10;
        result += getRoman(num4, 1);
        return result;
    }

    public static String getRoman(int num, int step) {
        if (num == 9) {
            if (step == 100) {
                return  "CM";
            }
            if (step == 10) {
                return "XC";
            }
            if (step == 1) {
                return "IX";
            }
        }
        if (num == 8) {
            if (step == 100) {
                return "DCCC";
            }
            if (step == 10) {
                return "LXXX";
            }
            if (step == 1) {
                return "VIII";
            }
        }
        if (num == 7) {
            if (step == 100) {
                return "DCC";
            }
            if (step == 10) {
                return "LXX";
            }
            if (step == 1) {
                return "VII";
            }
        }
        if (num == 6) {
            if (step == 100) {
                return "DC";
            }
            if (step == 10) {
                return "LX";
            }
            if (step == 1) {
                return "VI";
            }
        }
        if (num == 5) {
            if (step == 100) {
                return "D";
            }
            if (step == 10) {
                return "L";
            }
            if (step == 1) {
                return "V";
            }
        }
        if (num == 4) {
            if (step == 100) {
                return "CD";
            }
            if (step == 10) {
                return "XL";
            }
            if (step == 1) {
                return "IV";
            }
        }
        if (num == 3) {
            if (step == 1000) {
                return "MMM";
            }
            if (step == 100) {
                return "CCC";
            }
            if (step == 10) {
                return "XXX";
            }
            if (step == 1) {
                return "III";
            }
        }
        if (num == 2) {
            if (step == 1000) {
                return "MM";
            }
            if (step == 100) {
                return "CC";
            }
            if (step == 10) {
                return "XX";
            }
            if (step == 1) {
                return "II";
            }
        }
        if (num == 1) {
            if (step == 1000) {
                return "M";
            }
            if (step == 100) {
                return "C";
            }
            if (step == 10) {
                return "X";
            }
            if (step == 1) {
                return "I";
            }
        }
        return "";
    }
}
