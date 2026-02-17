/*
Problem: 125. Valid Palindrome
Platform: LeetCode
Link: https://leetcode.com/problems/valid-palindrome/
Difficulty: Easy
Pattern: Two Pointer (String)

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
