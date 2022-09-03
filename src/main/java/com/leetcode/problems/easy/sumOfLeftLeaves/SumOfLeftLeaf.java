package com.leetcode.problems.easy.sumOfLeftLeaves;

import com.leetcode.problems.common.TreeNode;

public class SumOfLeftLeaf {

    private int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, null);
    }

    private int dfs(TreeNode node, TreeNode parent) {
        if (node == null) {
            return 0;
        }

        int sum = 0;

        if (node.left == null && node.right == null && isLeftLeaf(node, parent)) {
            sum += node.val;
        }

        sum += dfs(node.left, node);
        sum += dfs(node.right, node);

        return sum;
    }

    private boolean isLeftLeaf(TreeNode node, TreeNode parent) {
        return parent != null && parent.left != null && parent.left.equals(node);
    }
}
