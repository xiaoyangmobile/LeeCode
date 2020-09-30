package com.xiaoyang;

public class TWO_AddTwoNumber {

    public ListNode add(ListNode l1, ListNode l2) {
        int pre = 0;
        ListNode node = new ListNode(0);
        ListNode p = node;
        while (l1 != null || l2 != null) {
            int x = l1==null ? 0:l1.val;
            int y = l2==null ? 0:l2.val;
            int value = (x + y + pre) % 10;
            pre = (x + y + pre) / 10;
            p.next = new ListNode(value);
            p = p.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (pre != 0) {
            p.next = new ListNode(1);
        }
        if (node.next != null) {
            return node.next;
        }
        return node;
    }


}
