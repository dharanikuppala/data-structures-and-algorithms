/*
Problem: 543. Diameter of Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/diameter-of-binary-tree/
Difficulty: Easy (conceptually Medium)
Pattern: DFS (Tree DP)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        computeHeight(root);
        return diameter;
    }

    private int computeHeight(TreeNode node) {

        if(node == null) return 0;

        int left = computeHeight(node.left);
        int right = computeHeight(node.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
