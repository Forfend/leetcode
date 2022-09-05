package com.leetcode.problems.medium.NaryTreeLevelOrderTraversal;

import com.leetcode.problems.common.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelValues = new ArrayList<>();

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                levelValues.add(node.value);
                queue.addAll(node.children);
            }
            result.add(levelValues);

        }
        return result;

    }
}
