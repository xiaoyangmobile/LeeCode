package com.xiaoyang;

import java.util.ArrayList;
import java.util.List;

public class BTreePostTraversing {
    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        printNode(root, result);
        return result;
    }

    public static void printNode(TreeNode node, List<Integer> result) {
        if (node.left != null) {
            printNode(node.left, result);
        }
        if (node.right != null) {
            printNode(node.right, result);
        }
        result.add(node.value);
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node = new TreeNode(1, null, node2);
        List<Integer> result = postOrderTraversal(node);
        for (int value : result) {
            System.out.println(value);
        }
    }

    public void printLeftNode(TreeNode node, List<Integer> result) {
        if (node.left != null) {
            printLeftNode(node.left, result);
        } else {
            printRightNode(node, result);
        }
    }

    public void printRightNode(TreeNode node, List<Integer> result) {
        if (node.right != null) {
            printLeftNode(node.right, result);
        } else {
            result.add(node.value);
        }
    }

}
class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}