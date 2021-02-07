package com.xiaoyang;

import java.util.ArrayList;
import java.util.List;

public class GeneratorBrackets {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }
        dfs("", n, n, result);
        return result;
    }

    public void dfs(String currentStr, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(currentStr);
            return;
        }
        if (left > right) {
            return;
        }
        if (left > 0) {
            dfs(currentStr + "(", left -1, right, result);
        }
        if (right > 0) {
            dfs(currentStr + ")", left, right -1, result);
        }
    }
}
