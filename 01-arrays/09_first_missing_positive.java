/*
Problem: 41. First Missing Positive
Platform: LeetCode
Link: https://leetcode.com/problems/first-missing-positive/
Difficulty: Hard
Pattern: Cyclic Sort / Index Placement

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int firstMissingPositive(int[] nums) {

        int i = 0;
        int n = nums.length;

        // Place each number at correct index
        while(i < n) {

            int correct = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find first index mismatch
        for(int index = 0; index < n; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }

        return n + 1;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
