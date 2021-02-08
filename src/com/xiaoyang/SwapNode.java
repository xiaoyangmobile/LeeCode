package com.xiaoyang;

import java.util.ArrayList;

public class SwapNode {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        nodes.add(node);
        while (node.next!= null) {
            node = node.next;
            nodes.add(node);
        }
        for (int i = 0; i < nodes.size() - 1; i+=2) {
            node = nodes.get(i+1);
            nodes.set(i+1, nodes.get(i));
            nodes.set(i, node);
            System.out.println(node.val);
        }
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i+1);
        }
        nodes.get(nodes.size()-1).next = null;
        return nodes.get(0);
    }


}
