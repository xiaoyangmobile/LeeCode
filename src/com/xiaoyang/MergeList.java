package com.xiaoyang;

public class MergeList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        ListNode node = null;
        node = merge(node, lists);
        return node;
    }

    public ListNode merge(ListNode node, ListNode[] listNodes) {
        int index = -1;
        ListNode currentNode = null;
        for (int i = 0; i < listNodes.length; i++) {
            if (listNodes[i] == null) {
                continue;
            }
            if (currentNode == null) {
                currentNode = listNodes[i];
                index = i;
                continue;
            }
            if (currentNode.val>= listNodes[i].val) {
                currentNode = listNodes[i];
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        if (node == null) {
            node = currentNode;
        } else {
            node.next = currentNode;
        }
        listNodes[index] = listNodes[index].next;
        merge(currentNode, listNodes);
        return node;
    }

    public static void main(String[] args) {

    }
}
