package com.leetcode.problems.easy.intersectionOfTwoLinkedLists;

import com.leetcode.problems.common.ListNode;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        while (listA != listB) {
            if (listA == null) {
                listA = headB;
            }

            if (listB == null) {
                listB = headA;
            }

            if (listA == listB) {
                return listA;
            }

            listA = listA.next;
            listB = listB.next;
        }

        return listA;
    }
}
