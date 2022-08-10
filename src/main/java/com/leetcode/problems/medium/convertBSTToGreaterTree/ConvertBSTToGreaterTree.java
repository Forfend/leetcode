package com.leetcode.problems.medium.convertBSTToGreaterTree;

import com.leetcode.problems.common.TreeNode;

public class ConvertBSTToGreaterTree {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }

        return root;
    }
}
