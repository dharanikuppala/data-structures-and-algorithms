/*
Problem: 1470. Shuffle the Array
Platform: LeetCode
Link: https://leetcode.com/problems/shuffle-the-array/
Difficulty: Easy
Pattern: Direct Index Mapping

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];

        for(int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }

        return result;
    }
}
