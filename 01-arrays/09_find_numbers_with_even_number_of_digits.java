/*
Problem: 1295. Find Numbers with Even Number of Digits
Platform: LeetCode
Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
Difficulty: Easy
Pattern: Digit Counting / Math

Time Complexity: O(n * d)  (d = number of digits)
Space Complexity: O(1)
*/

class Solution {

    public int findNumbers(int[] nums) {

        int count = 0;

        for(int num : nums) {
            if(hasEvenDigits(num)) {
                count++;
            }
        }

        return count;
    }

    private boolean hasEvenDigits(int num) {
        return countDigits(num) % 2 == 0;
    }

    private int countDigits(int num) {

        if(num == 0) return 1;

        num = Math.abs(num);

        int digits = 0;

        while(num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }
}
