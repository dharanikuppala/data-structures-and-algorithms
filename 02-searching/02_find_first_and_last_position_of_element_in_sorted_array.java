/*
Problem: 34. Find First and Last Position of Element in Sorted Array
Platform: LeetCode
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Difficulty: Medium
Pattern: Binary Search (Lower Bound & Upper Bound)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }

    private int binarySearch(int[] nums, int target, boolean findFirst) {

        int result = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {

                result = mid;

                if(findFirst) {
                    right = mid - 1;   // move left
                } else {
                    left = mid + 1;    // move right
                }

            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
