package com.leetcode.problems.medium.linkedListCycle2;

import com.leetcode.problems.common.ListNode;

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode intersection = getIntersection(head);

        if (intersection == null) {
            return null;
        }

        ListNode slow = head;

        while (slow != intersection) {
            slow = slow.next;
            intersection = intersection.next;
        }

        return slow;
    }

    private ListNode getIntersection(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }
}
