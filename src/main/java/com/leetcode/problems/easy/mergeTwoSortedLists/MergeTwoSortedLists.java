package com.leetcode.problems.easy.mergeTwoSortedLists;

import com.leetcode.problems.common.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode tail = newList;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                tail.next = list2;
                list2 = list2.next;
            } else {
                tail.next = list1;
                list1 = list1.next;
            }
            tail = tail.next;
        }

        if (list1 == null) {
            tail.next = list2;
        }

        if (list2 == null) {
            tail.next = list1;
        }

        return newList.next;
    }
}
