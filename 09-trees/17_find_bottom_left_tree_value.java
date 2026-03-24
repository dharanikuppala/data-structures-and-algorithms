/*
Problem: 513. Find Bottom Left Tree Value
Platform: LeetCode
Difficulty: Medium
Pattern: BFS / Level Order Traversal

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public int findBottomLeftValue(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            root = queue.poll();

            // Add right first, then left
            if(root.right != null){
                queue.offer(root.right);
            }

            if(root.left != null){
                queue.offer(root.left);
            }
        }

        return root.val;
    }
}
