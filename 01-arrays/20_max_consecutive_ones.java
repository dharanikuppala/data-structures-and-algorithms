/*
Problem: 485. Max Consecutive Ones
Platform: LeetCode
Difficulty: Easy
Pattern: Array Traversal / Counting

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int currentCount = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1){
                currentCount++;
                max = Math.max(max, currentCount);
            }
            else{
                currentCount = 0;
            }
        }

        return max;
    }
}
