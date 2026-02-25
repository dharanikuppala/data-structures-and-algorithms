/*
Problem: 199. Binary Tree Right Side View
Platform: LeetCode
Link: https://leetcode.com/problems/binary-tree-right-side-view/
Difficulty: Medium
Pattern: BFS (Rightmost Node Per Level)

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();

            for(int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if(i == size - 1) {
                    result.add(node.val);
                }

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }

        return result;
    }
}

/*
Advanced DFS method 
Problem: 199. Binary Tree Right Side View
Platform: LeetCode
Pattern: DFS (Right-first traversal)
Time Complexity: O(n)
Space Complexity: O(h)  // recursion stack

import java.util.*;

class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode node, int depth, List<Integer> result) {

        if(node == null) return;

        // If visiting this depth for the first time
        if(depth == result.size()) {
            result.add(node.val);
        }

        // Visit right subtree first
        dfs(node.right, depth + 1, result);
        dfs(node.left, depth + 1, result);
    }
}
 */ 
