package com.leetcode.problems.easy.middleOfLinkedList;

import com.leetcode.problems.common.ListNode;

public class MiddleOfLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}
