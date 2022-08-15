package com.leetcode.problems.medium.binaryTreeLevelOrderTraversal2;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelValues = new ArrayList<>();
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode currentNode = queue.poll();
                levelValues.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(0, levelValues);
        }

        return result;
    }
}
