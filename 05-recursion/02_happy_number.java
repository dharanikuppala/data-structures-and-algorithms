/*
Problem: 202. Happy Number
Platform: LeetCode
Link: https://leetcode.com/problems/happy-number/
Difficulty: Easy
Pattern: Floyd’s Cycle Detection

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while(slow != fast);

        return slow == 1;
    }

    private int getNext(int number) {

        int sum = 0;

        while(number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}
