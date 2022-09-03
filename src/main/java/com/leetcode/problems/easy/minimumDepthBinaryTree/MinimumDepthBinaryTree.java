package com.leetcode.problems.easy.minimumDepthBinaryTree;

import com.leetcode.problems.common.TreeNode;

public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return minDepth(root.right);
        }

        if (root.right == null) {
            return minDepth(root.left);
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
