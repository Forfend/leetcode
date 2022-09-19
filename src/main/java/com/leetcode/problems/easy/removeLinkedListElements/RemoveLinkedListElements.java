package com.leetcode.problems.easy.removeLinkedListElements;

import com.leetcode.problems.common.ListNode;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }
}
