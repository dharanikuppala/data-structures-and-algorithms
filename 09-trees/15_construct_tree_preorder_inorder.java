/*
Problem: 105. Construct Binary Tree from Preorder and Inorder Traversal
Platform: LeetCode
Difficulty: Medium
Pattern: Divide & Conquer

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    private Map<Integer, Integer> inorderMap = new HashMap<>();
    private int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {

        if(left > right) return null;

        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);

        int inorderIndex = inorderMap.get(rootValue);

        root.left = build(preorder, left, inorderIndex - 1);
        root.right = build(preorder, inorderIndex + 1, right);

        return root;
    }
}
