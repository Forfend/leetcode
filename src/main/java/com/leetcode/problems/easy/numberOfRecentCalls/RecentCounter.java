package com.leetcode.problems.easy.numberOfRecentCalls;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {

    private Deque<Integer> queue;

    public RecentCounter() {
        this.queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        this.queue.add(t);

        for (int timestamp : this.queue) {
            if (timestamp < t - 3000) {
                this.queue.pollFirst();
            }
        }

        return this.queue.size();
    }

}
