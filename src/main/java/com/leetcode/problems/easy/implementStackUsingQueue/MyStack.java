package com.leetcode.problems.easy.implementStackUsingQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

    private Deque<Integer> queue;

    public MyStack() {
        this.queue = new ArrayDeque<>();
    }

    public void push(int x) {
        this.queue.addLast(x);
        moveToTheEnd();
    }

    public int pop() {
        return this.queue.pollFirst();
    }

    public int top() {
        return this.queue.peekFirst();
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }

    private void moveToTheEnd() {
        int counter = 0;
        while (counter != this.queue.size() - 1) {
            this.queue.addLast(this.queue.pollFirst());
        }
    }
}
