package com.leetcode.problems.medium.deleteNodeInBST;

import com.leetcode.problems.common.TreeNode;

public class DeleteNodeInBST {

    public TreeNode deleteNode(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (root.val > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.val < val) {
            root.right = deleteNode(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, min.val);

        }

        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
