package com.leetcode.problems.easy.averageLevelsIninaryTree;

import com.leetcode.problems.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return List.of(0.0);
        }
        List<Double> averages = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            double sumOfLevel = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sumOfLevel += node.val;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            averages.add(sumOfLevel / size);
        }

        return averages;
    }
}
