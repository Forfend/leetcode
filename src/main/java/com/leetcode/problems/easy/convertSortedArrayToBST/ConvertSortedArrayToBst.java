package com.leetcode.problems.easy.convertSortedArrayToBST;

import com.leetcode.problems.common.TreeNode;

public class ConvertSortedArrayToBst {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootIndex = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[rootIndex]);
        root.left = buildBST(nums, left, rootIndex - 1);
        root.right = buildBST(nums, rootIndex + 1, right);

        return root;
    }
}
