/*
Problem: 637. Average of Levels in Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
Difficulty: Easy
Pattern: BFS / Level Order Traversal

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                sum += node.val;

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(sum / size);
        }

        return result;
    }
}
