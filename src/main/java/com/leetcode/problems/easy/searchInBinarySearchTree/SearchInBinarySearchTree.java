package com.leetcode.problems.easy.searchInBinarySearchTree;


import com.leetcode.problems.common.TreeNode;

public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (root.val < val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return null;
    }

}
