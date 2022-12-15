package com.leetcode.problems.medium.minStack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minValues;

    public MinStack() {
        this.stack = new Stack<>();
        this.minValues = new Stack<>();
    }

    public void push(int val) {
        this.stack.add(val);
        if (this.minValues.isEmpty()) {
            this.minValues.push(val);
        } else {
            this.minValues.push(Math.min(this.minValues.peek(), val));
        }
    }

    public void pop() {
        this.stack.pop();
        this.minValues.pop();
    }

    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }

    public int getMin() {
        return this.minValues.peek();
    }
}
