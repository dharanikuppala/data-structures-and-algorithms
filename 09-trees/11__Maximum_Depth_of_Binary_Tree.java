/**
 * LeetCode 104
 * Problem: Maximum Depth of Binary Tree
 * 
 * Approach:
 * - Use recursion.
 * - For each node, compute the height of left and right subtrees.
 * - Return max(leftHeight, rightHeight) + 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)  // recursion stack (h = tree height)
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
