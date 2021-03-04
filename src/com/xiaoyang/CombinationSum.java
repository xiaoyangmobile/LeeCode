package com.xiaoyang;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        if (candidates.length == 0) {
            return lists;
        }
        Arrays.sort(candidates);
        List<int[]> newList = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (i == 0 || candidates[i] != candidates[i-1]) {
                newList.add(new int[]{candidates[i], 1});
            } else {
                newList.get(newList.size() - 1)[1]++;
            }
        }
        dsf2(newList, target, 0, current, lists);
        return lists;
    }

    public void dsf2(List<int[]> newLis, int target, int index, List<Integer> current, List<List<Integer>> lists) {
        if (target == 0) {
            lists.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 ) {
            return;
        }
        if (index >= newLis.size()) {
            return;
        }
        dsf2(newLis, target, index+1, current, lists);
        for (int i = 0; i < newLis.get(index)[1]; i++) {
            current.add(newLis.get(index)[0]);
            dsf2(newLis, target-newLis.get(index)[0] * (i + 1), index+1, current, lists);
        }
        for (int i = 0; i < newLis.get(index)[1]; i++) {
            current.remove(current.size()-1);
        }
    }

    public void getIndex(int[] candidates, int index) {
        int currentIndex = index;
        while (currentIndex > 0 && candidates[index] == candidates[index-1] && currentIndex < candidates.length) {
            currentIndex++;
        }
    }

    public static void main(String[] args) {
        int[] source = new int[]{2,3,6,7};
        combinationSum(source, 7);
    }
}
