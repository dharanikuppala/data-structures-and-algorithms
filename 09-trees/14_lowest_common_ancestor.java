/*
Problem: 236. Lowest Common Ancestor of a Binary Tree
Platform: LeetCode
Difficulty: Medium
Pattern: DFS (Post-order)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }
}
