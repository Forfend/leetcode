package com.leetcode.problems.medium.deleteMiddleNode;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DeleteMiddleNodeLinkedList {

    public ListNode deleteMiddle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode prev = null;

        if (head.next == null) {
            return null;
        }

        while (fastPointer != null && fastPointer.next != null) {
            prev = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        ListNode nextToMiddle = slowPointer.next;
        prev.next = nextToMiddle;

        return head;
    }
}
