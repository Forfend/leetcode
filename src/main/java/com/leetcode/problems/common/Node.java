package com.leetcode.problems.common;

import java.util.List;

public class Node {
    public int value;
    public List<Node> children;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }
}
