/*
Problem: 1929. Concatenation of Array
Platform: LeetCode
Link: https://leetcode.com/problems/concatenation-of-array/
Difficulty: Easy
Pattern: Direct Index Mapping

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);

        return ans;
    }
}
