/*
Problem: 107. Binary Tree Level Order Traversal II
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
Difficulty: Medium
Pattern: BFS (Bottom-Up Level Order)

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);

            for(int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                level.add(node.val);

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }

            result.add(0, level);  // insert at beginning
        }

        return result;
    }
}
