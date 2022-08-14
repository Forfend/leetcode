package com.leetcode.problems.easy.findCorrespondingNodeBTinClonedBT;

import com.leetcode.problems.common.TreeNode;

public class FindCorrespondingNodeBtInClonedBt {
    private TreeNode result;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original, cloned, target);
        return result;
    }

    private void traverse(TreeNode original, TreeNode cloned, TreeNode target) {
        if (original != null) {
            traverse(original.left, cloned.left, target);
            if (original == target) {
                this.result = cloned;
            }
            traverse(original.right, cloned.right, target);
        }
    }
}
