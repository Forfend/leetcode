package com.leetcode.problems.easy.reverseLinkedList;


import com.leetcode.problems.common.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;

        head.next = null;

        return node;
    }
}
