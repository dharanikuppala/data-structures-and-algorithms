/*
Problem: 283. Move Zeroes
Platform: LeetCode
Link: https://leetcode.com/problems/move-zeroes/
Difficulty: Easy
Pattern: Two Pointer / Stable Partition

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            if(nums[right] != 0) {

                if(left != right) {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }

                left++;
            }
        }
    }
}
