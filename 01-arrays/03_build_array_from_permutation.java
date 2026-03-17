/*
Problem: 1920. Build Array from Permutation
Platform: LeetCode
Link: https://leetcode.com/problems/build-array-from-permutation/
Difficulty: Easy
Pattern: Direct Index Mapping

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
