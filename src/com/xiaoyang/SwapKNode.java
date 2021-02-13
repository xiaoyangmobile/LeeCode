package com.xiaoyang;

import java.util.ArrayList;

public class SwapKNode {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k == 1) {
            return head;
        }
        ListNode node = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        nodes.add(node);
        while (node.next!= null) {
            node = node.next;
            nodes.add(node);
        }
        if (nodes.size() < k) {
            return head;
        }
        int index = 0;
        if (nodes.size() >= k) {
            index = k-1;
        }
        for (int i = 0; i < nodes.size(); i += k) {
            swap(nodes, i, k);
        }
        for (int i = 0; i < nodes.size(); i ++) {
            System.out.println(nodes.get(i).val);
            System.out.println(index);
            System.out.println(i);
        }
        return nodes.get(index);
    }

    public void swap(ArrayList<ListNode> nodes, int index, int length) {
        int end = index + length;
        if (nodes.size() < index + length) {
            return;
        }
        for (int i = end - 1; i >= index; i--) {
            if (i == index ) {
                if (i + length < nodes.size()) {
                    if (i + length + length - 1 < nodes.size()) {
                        nodes.get(i).next = nodes.get(i + length + length - 1);
                    } else {
                        nodes.get(i).next = nodes.get(i + length);
                    }
                } else {
                    nodes.get(i).next = null;
                }

            } else {
                nodes.get(i).next = nodes.get(i - 1);
            }
        }
    }
}

