package com.xiaoyang;

import java.util.HashSet;
import java.util.Stack;

public class VerifyBracket {
    public static boolean isValid(String s) {
        HashSet<String> set = new HashSet<String>();
        set.add("(");
        set.add("{");
        set.add("[");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));
            if (set.contains(value)) {
                stack.push(value);
            } else {
                if (stack.empty()) {
                    return false;
                }
                String key = stack.pop();
                if (value.equals("}") && key.equals("{") || value.equals("]") && key.equals("[") || value.equals(")") && key.equals("(")) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        isValid("()");
    }
}
