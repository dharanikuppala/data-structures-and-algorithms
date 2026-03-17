/*
Problem: 442. Find All Duplicates in an Array
Platform: LeetCode
Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
Difficulty: Medium
Pattern: Cyclic Sort / Index Placement

Time Complexity: O(n)
Space Complexity: O(1) (ignoring output list)
*/

import java.util.*;

class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        int i = 0;

        // Cyclic sort
        while(i < nums.length) {

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();

        // Collect duplicates
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                result.add(nums[index]);
            }
        }

        return result;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
