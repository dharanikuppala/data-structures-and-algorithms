/*
Problem: 103. Binary Tree Zigzag Level Order Traversal
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
Difficulty: Medium
Pattern: BFS + Deque

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean leftToRight = true;

        while(!deque.isEmpty()) {

            int size = deque.size();
            List<Integer> level = new ArrayList<>(size);

            for(int i = 0; i < size; i++) {

                if(leftToRight) {

                    TreeNode node = deque.pollFirst();
                    level.add(node.val);

                    if(node.left != null) deque.addLast(node.left);
                    if(node.right != null) deque.addLast(node.right);

                } else {

                    TreeNode node = deque.pollLast();
                    level.add(node.val);

                    if(node.right != null) deque.addFirst(node.right);
                    if(node.left != null) deque.addFirst(node.left);
                }
            }

            leftToRight = !leftToRight;
            result.add(level);
        }

        return result;
    }
}
