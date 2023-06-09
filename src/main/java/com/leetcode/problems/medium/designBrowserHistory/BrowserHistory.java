package com.leetcode.problems.medium.designBrowserHistory;

class ListNode {
    ListNode prev;
    ListNode next;
    String val;

    ListNode(String val) {
        this.val = val;
    }
}

public class BrowserHistory {

    private ListNode tail;

    public BrowserHistory(String homepage) {
        this.tail = new ListNode(homepage);
    }

    public void visit(String url) {
        ListNode node = new ListNode(url);
        node.prev = tail;
        tail.next = node;
        tail = node;
    }

    public String back(int steps) {

        while (tail.prev != null && steps > 0) {
            tail = tail.prev;
            steps--;
        }

        return tail.val;
    }

    public String forward(int steps) {

        while (tail.next != null && steps > 0) {
            tail = tail.next;
            steps--;
        }

        return tail.val;
    }
}
