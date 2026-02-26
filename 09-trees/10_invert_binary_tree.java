/*
Problem: 226. Invert Binary Tree
Platform: LeetCode
Link: https://leetcode.com/problems/invert-binary-tree/
Difficulty: Easy
Pattern: DFS (Tree Transformation)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
