package com.leetcode.problems.easy.reverseLinkedList;


import com.leetcode.problems.common.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = reverseListRecursion(head.next);
        head.next.next = head;

        head.next = null;

        return node;
    }
}
