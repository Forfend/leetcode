package com.leetcode.problems.easy.implementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> stack;
    private Stack<Integer> reverse;

    public MyQueue() {
        this.stack = new Stack<>();
        this.reverse = new Stack<>();
    }

    public void push(int x) {
        this.stack.push(x);
    }

    public int pop() {
        peek();
        return this.reverse.pop();
    }

    public int peek() {
        if (this.reverse.isEmpty()) {
            while (!stack.isEmpty()) {
                this.reverse.push(stack.pop());
            }
        }

        return this.reverse.peek();
    }

    public boolean empty() {
        return this.reverse.isEmpty() && this.stack.isEmpty();
    }
}
