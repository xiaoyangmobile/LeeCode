package com.xiaoyang;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dsf(candidates, target, lists, current, 0);
        return lists;
    }

    public static void dsf(int[] candidates, int target, List<List<Integer>> lists, List<Integer> current, int index) {
        if (target == 0) {
            lists.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        if (index >= candidates.length) {
            return;
        }
        if (index < candidates.length) {
            dsf(candidates, target, lists, current, index+1);
        }
        current.add(candidates[index]);
        dsf(candidates, target - candidates[index], lists, current, index);
        current.remove(current.size() -1);

    }

    public static void main(String[] args) {
        int[] source = new int[]{2,3,6,7};
        combinationSum(source, 7);
    }
}
