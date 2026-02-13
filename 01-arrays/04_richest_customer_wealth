/*
Problem: 1672. Richest Customer Wealth
Platform: LeetCode
Link: https://leetcode.com/problems/richest-customer-wealth/
Difficulty: Easy
Pattern: Matrix Traversal / Accumulation

Time Complexity: O(m × n)
Space Complexity: O(1)
*/

class Solution {

    public int maximumWealth(int[][] accounts) {

        int richest = 0;

        for(int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            richest = Math.max(richest, sum);
        }

        return richest;
    }
}
