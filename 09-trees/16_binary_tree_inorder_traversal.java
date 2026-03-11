/*
Problem: 94. Binary Tree Inorder Traversal
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
Difficulty: Easy
Pattern: Tree Traversal / DFS

Traversal Order: Left → Root → Right

Time Complexity: O(n)
Space Complexity: O(h)   // h = height of tree (recursion stack)
*/

import java.util.*;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> result) {

        if(node == null) {
            return;
        }

        // Visit left subtree
        inorder(node.left, result);

        // Visit root
        result.add(node.val);

        // Visit right subtree
        inorder(node.right, result);
    }
}
