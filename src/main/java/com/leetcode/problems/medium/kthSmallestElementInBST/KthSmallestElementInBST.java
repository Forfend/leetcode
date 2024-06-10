package com.leetcode.problems.medium.kthSmallestElementInBST;

import com.leetcode.problems.common.TreeNode;

import java.util.PriorityQueue;

public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        dfs(root, heap);

        while (k > 1) {
            heap.poll();
            k--;
        }

        return heap.poll();
    }

    private void dfs(TreeNode root, PriorityQueue<Integer> heap) {
        if (root == null) {
            return;
        }

        dfs(root.left, heap);
        heap.offer(root.val);
        dfs(root.right, heap);
    }
}
