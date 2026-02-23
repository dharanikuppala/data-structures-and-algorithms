/*
Problem: 20. Valid Parentheses
Platform: LeetCode
Link: https://leetcode.com/problems/valid-parentheses/
Difficulty: Easy
Pattern: Stack

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
