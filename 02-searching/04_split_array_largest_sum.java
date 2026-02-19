/*
Problem: 410. Split Array Largest Sum
Platform: LeetCode
Link: https://leetcode.com/problems/split-array-largest-sum/
Difficulty: Hard
Pattern: Binary Search on Answer

Time Complexity: O(n log(sum))
Space Complexity: O(1)
*/

class Solution {

    public int splitArray(int[] nums, int m) {

        int left = 0;
        int right = 0;

        for(int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while(left < right) {

            int mid = left + (right - left) / 2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums) {

                if(sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
