package com.leetcode.problems.easy.searchInBinarySearchTree;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

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
