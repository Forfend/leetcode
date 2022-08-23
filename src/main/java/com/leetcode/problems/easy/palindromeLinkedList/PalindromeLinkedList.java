package com.leetcode.problems.easy.palindromeLinkedList;

import com.leetcode.problems.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = values.size() - 1;

        while (left <= right) {
            if (values.get(left) != values.get(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
