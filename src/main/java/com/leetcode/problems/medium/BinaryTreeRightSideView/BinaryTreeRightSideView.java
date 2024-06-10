package com.leetcode.problems.medium.BinaryTreeRightSideView;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            int qLen = queue.size();
            for (int i = 0; i < qLen; i++) {
                node = queue.removeFirst();
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (node != null) {
                result.add(node.val);
            }
        }

        return result;
    }
}
