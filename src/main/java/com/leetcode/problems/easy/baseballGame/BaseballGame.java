package com.leetcode.problems.easy.baseballGame;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {
        Stack<Integer> records = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int prev = records.pop();
                int prevPrev = records.pop();
                int sum = prev + prevPrev;
                records.push(prevPrev);
                records.push(prev);
                records.push(sum);
            } else if (s.equals("C")) {
                records.pop();
            } else if (s.equals("D")) {
                int score = records.peek();
                records.push(2 * score);
            } else {
                records.push(Integer.parseInt(s));
            }
        }
        return records.stream().reduce(0, Integer::sum);
    }
}
