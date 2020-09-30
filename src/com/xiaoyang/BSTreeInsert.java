package com.xiaoyang;

public class BSTreeInsert {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val > root.value) {
            insertRight(root, val);
        }
        if (val < root.value) {
            insertLeft(root, val);
        }
        return root;
    }

    public static void insertLeft(TreeNode node, int val) {
        if (node.left == null) {
            node.left = new TreeNode(val);
            return;
        }
        insertIntoBST(node.left, val);
    }

    public static void insertRight(TreeNode node, int val) {
        if (node.right == null) {
            node.right = new TreeNode(val);
            return;
        }
        insertIntoBST(node.right, val);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(2, node1, node2);
        TreeNode node5 = new TreeNode(4, node4, node3);
        TreeNode node = insertIntoBST(node5, 5);
        System.out.println(node);
    }
}
