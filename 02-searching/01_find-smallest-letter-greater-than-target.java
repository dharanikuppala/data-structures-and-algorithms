/*
Problem: 744. Find Smallest Letter Greater Than Target
Platform: LeetCode
Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
Difficulty: Easy
Pattern: Binary Search (Upper Bound)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }
}
