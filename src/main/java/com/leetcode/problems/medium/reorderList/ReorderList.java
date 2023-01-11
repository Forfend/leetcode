package com.leetcode.problems.medium.reorderList;

import com.leetcode.problems.common.ListNode;

public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (right != null) {
            ListNode nextNode = right.next;
            right.next = prev;
            prev = right;
            right = nextNode;
        }

        ListNode rightHead = prev;
        ListNode start = head;
        while (rightHead != null) {
            ListNode temp1 = start.next;
            ListNode temp2 = rightHead.next;

            start.next = rightHead;
            rightHead.next = temp1;

            start = temp1;
            rightHead = temp2;

        }
    }
}
