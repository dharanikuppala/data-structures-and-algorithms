/*
Problem: 268. Missing Number
Platform: LeetCode
Link: https://leetcode.com/problems/missing-number/
Difficulty: Easy
Pattern: Cyclic Sort (Index Placement)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int missingNumber(int[] nums) {

        int i = 0;

        // Place each number at its correct index
        while(i < nums.length) {
            int correct = nums[i];

            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the missing index
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
