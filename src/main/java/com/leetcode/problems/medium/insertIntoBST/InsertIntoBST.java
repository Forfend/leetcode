package com.leetcode.problems.medium.insertIntoBST;

import com.leetcode.problems.common.TreeNode;

public class InsertIntoBST {

    public TreeNode insertIntoBst(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            return root.left = insertIntoBst(root.left, val);
        } else {
            root.right = insertIntoBst(root.right, val);
        }

        return root;
    }

}
