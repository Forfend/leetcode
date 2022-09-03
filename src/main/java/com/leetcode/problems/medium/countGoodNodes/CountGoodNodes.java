package com.leetcode.problems.medium.countGoodNodes;

import com.leetcode.problems.common.TreeNode;

public class CountGoodNodes {

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    private int dfs(TreeNode node, int maxValue) {
        if (node == null) {
            return 0;
        }

        //main logic of DFS hoes here
        int goodNodes = node.val < maxValue ? 0 : 1;
        maxValue = Math.max(node.val, maxValue);

        goodNodes += dfs(node.left, maxValue);
        goodNodes += dfs(node.right, maxValue);

        return goodNodes;

    }
}
