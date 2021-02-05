package com.xiaoyang;

public class MergeTwoList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node;
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            node = l1;
            merge(node, l1.next, l2);
        } else {
            node = l2;
            merge(node, l1, l2.next);
        }
        return node;
    }

    public void merge(ListNode node, ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            node.next = l2;
            return;
        }
        if (l1 != null && l2 == null) {
            node.next = l1;
            return;
        }
        if (l1.val <= l2.val) {
            node.next = l1;
            merge(node.next, l1.next, l2);
        } else {
            node.next = l2;
            merge(node.next, l1, l2.next);
        }
    }
}
