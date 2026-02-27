/**
 * LeetCode 108
 * Problem: Convert Sorted Array to Binary Search Tree
 *
 * Approach:
 * - Use divide and conquer.
 * - Choose middle element as root to maintain balance.
 * - Recursively build left subtree from left half.
 * - Recursively build right subtree from right half.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(log n)  // recursion stack for balanced tree
 */

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);

        return root;
    }
}
