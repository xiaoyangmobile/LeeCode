package com.xiaoyang;

import java.util.ArrayList;

public class RmNodeFromEnd {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // 现将链表转化为数组，然后通过索引处理。缺点是浪费控件；优点是节约时间。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> nods = new ArrayList<>();
        nods.add(head);
        while (head.next != null) {
            head = head.next;
            nods.add(head);
        }
        if (n == nods.size()) {
            if (nods.size() == 1) {
                return null;
            } else {
                return nods.get(1);
            }
        }
        if (n == 1) {
            if (nods.size() == 1) {
                return null;
            } else {
                nods.get(nods.size()-2).next = null;
                return nods.get(0);
            }
        }
        ListNode nodePre = nods.get(nods.size()-n-1);
        ListNode nodeNext = nods.get(nods.size() - n + 1);
        nodePre.next = nodeNext;
        return nods.get(0);
    }
}
