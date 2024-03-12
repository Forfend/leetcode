package com.leetcode.problems.easy.numberOfStudentsUnableToEatLunch;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfStudentsUnableToEatLunch {

    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int s : students) {
            st.addLast(s);
        }

        int withOutLunch = 0;
        for (int sandwich : sandwiches) {
            while (withOutLunch != st.size()) {
                if (st.peekFirst() == sandwich) {
                    st.pollFirst();
                    withOutLunch = 0;
                    break;
                } else {
                    withOutLunch++;
                    st.addLast(st.pollFirst());
                }
            }
        }

        return withOutLunch;
    }

}
