/*
Problem: 53. Maximum Subarray
Platform: LeetCode
Difficulty: Medium
Pattern: Kadane’s Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currentSum = 0;

        for(int num : nums) {

            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
