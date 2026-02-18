/*
Problem: 1342. Number of Steps to Reduce a Number to Zero
Platform: LeetCode
Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
Difficulty: Easy
Pattern: Recursion / Bit Manipulation

Time Complexity: O(log n)
Space Complexity: O(log n) (recursive stack)
*/

class Solution {

    public int numberOfSteps(int num) {
        if(num == 0) return 0;

        if(num % 2 == 0) {
            return 1 + numberOfSteps(num / 2);
        }

        return 1 + numberOfSteps(num - 1);
    }
}
