/*
Problem: 167. Two Sum II - Input Array Is Sorted
Platform: LeetCode
Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Difficulty: Medium
Pattern: Two Pointer

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while(start < end) {

            int sum = numbers[start] + numbers[end];

            if(sum == target) {
                return new int[]{start + 1, end + 1};
            }

            if(sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[]{-1, -1};
    }
}
