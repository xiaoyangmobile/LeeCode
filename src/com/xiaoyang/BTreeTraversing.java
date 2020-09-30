package com.xiaoyang;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BTreeTraversing {

   public static void preOrderTraversal(TreeNode node) {
       if (node != null) {
           System.out.print(node.value);
           System.out.print(",");
           preOrderTraversal(node.left);
           preOrderTraversal(node.right);
       }
   }

    public static void middleOrderTraversal(TreeNode node) {
        if (node != null) {
            middleOrderTraversal(node.left);
            System.out.print(node.value);
            System.out.print(",");
            middleOrderTraversal(node.right);
        }
    }

    public static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value);
            System.out.print(",");
        }
    }

    public static void breadthTraversal(TreeNode node) {
        Queue<TreeNode> nodeQueue = new LinkedBlockingDeque<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()) {
            TreeNode treeNode = nodeQueue.poll();
            System.out.print(treeNode.value);
            System.out.print(",");
            if (treeNode.left != null) {
                nodeQueue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                nodeQueue.add(treeNode.right);
            }
        }

    }

   public static void main(String[] args) {
       TreeNode a, b, c, d, e, f, g, h, i;
       a = new TreeNode(1);
       c = new TreeNode(3);
       h = new TreeNode(8);
       i = new TreeNode(9);
       d = new TreeNode(4, c, null);
       b = new TreeNode(2, a, d);
       g = new TreeNode(7, null, i);
       f = new TreeNode(6, g, h);
       e = new TreeNode(5, b, f);

       System.out.println("先序遍历：");
       preOrderTraversal(e);
       System.out.println();
       System.out.println("中序遍历：");
       middleOrderTraversal(e);
       System.out.println();
       System.out.println("后序遍历：");
       postOrderTraversal(e);
       System.out.println();
       System.out.println("广度遍历：");
       breadthTraversal(e);
   }
}
