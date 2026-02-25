/*
Problem: 993. Cousins in Binary Tree
Platform: LeetCode
Pattern: DFS (Depth + Parent Check)

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public boolean isCousins(TreeNode root, int x, int y) {

        return (getDepth(root, x, 0) == getDepth(root, y, 0)) 
                && !areSiblings(root, x, y);
    }

    private int getDepth(TreeNode node, int target, int depth) {

        if(node == null) return -1;

        if(node.val == target) return depth;

        int left = getDepth(node.left, target, depth + 1);
        if(left != -1) return left;

        return getDepth(node.right, target, depth + 1);
    }

    private boolean areSiblings(TreeNode node, int x, int y) {

        if(node == null) return false;

        if(node.left != null && node.right != null) {

            if((node.left.val == x && node.right.val == y) ||
               (node.left.val == y && node.right.val == x)) {
                return true;
            }
        }

        return areSiblings(node.left, x, y) ||
               areSiblings(node.right, x, y);
    }
}
