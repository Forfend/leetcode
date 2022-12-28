package com.leetcode.problems.easy.implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        this.queue.add(x);
        moveElementToEnd();
    }

    public int pop() {
        return this.queue.poll();
    }

    public int top() {
        return this.queue.peek();
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }

    private void moveElementToEnd() {
        int size = this.queue.size();
        while (size != 1) {
            this.queue.add(this.queue.poll());
            size--;
        }
    }
}
