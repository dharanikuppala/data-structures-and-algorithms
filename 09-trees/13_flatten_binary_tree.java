/*
Problem: 114. Flatten Binary Tree to Linked List
Platform: LeetCode
Pattern: DFS (Reverse Preorder)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    private TreeNode prev = null;

    public void flatten(TreeNode root) {

        if(root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
    }
}
