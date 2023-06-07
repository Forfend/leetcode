package com.leetcode.problems.medium.designLinkedList;

class ListNode {
    ListNode prev;
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {

    private ListNode left;
    private ListNode right;

    public MyLinkedList() {
        this.left = new ListNode(0);
        this.right = new ListNode(0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public int get(int index) {
        ListNode current = this.left.next;

        while (current != null && index > 0) {
            current = current.next;
            index--;
        }

        if (current != null && current != this.right && index == 0) {
            return current.val;
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        ListNode prev = this.left;
        ListNode currentHead = this.left.next;

        node.next = currentHead;
        node.prev = prev;

        currentHead.prev = node;
        prev.next = node;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode currentTail = this.right.prev;
        ListNode next = this.right;

        node.next = next;
        node.prev = currentTail;

        currentTail.next = node;
        next.prev = node;
    }

    public void addAtIndex(int index, int val) {
        ListNode current = this.left.next;

        while (current != null && index > 0) {
            current = current.next;
            index--;
        }

        if (current != null && index == 0) {
            ListNode node = new ListNode(val);
            ListNode prev = current.prev;
            node.next = current;
            node.prev = prev;
            current.prev = node;
            prev.next = node;
        }

    }

    public void deleteAtIndex(int index) {
        ListNode current = this.left.next;

        while (current != null && index > 0) {
            current = current.next;
            index--;
        }

        if (current != null && current != this.right && index == 0) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
}
