/*
Problem: 700. Search in a Binary Search Tree
Platform: LeetCode
Difficulty: Easy
Pattern: Binary Search Tree / Recursion

Time Complexity: O(h)
Space Complexity: O(h)
*/

class Solution {

    public TreeNode searchBST(TreeNode root, int val) {

        // Base case
        if(root == null) return null;

        // If value found
        if(root.val == val) return root;

        // Search in left subtree
        if(val < root.val){
            return searchBST(root.left, val);
        }
        // Search in right subtree
        else{
            return searchBST(root.right, val);
        }
    }
}
