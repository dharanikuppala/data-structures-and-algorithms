/*
Problem: 100. Same Tree
Platform: LeetCode
Link: https://leetcode.com/problems/same-tree/
Difficulty: Easy
Pattern: DFS (Tree Comparison)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
