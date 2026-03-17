/*
Problem: 204. Count Primes
Platform: LeetCode
Link: https://leetcode.com/problems/count-primes/
Difficulty: Medium
Pattern: Sieve of Eratosthenes

Time Complexity: O(n log log n)
Space Complexity: O(n)
*/

class Solution {

    public int countPrimes(int n) {

        if(n <= 2) return 0;

        boolean[] isComposite = new boolean[n];
        int count = 0;

        for(int i = 2; i * i < n; i++) {

            if(!isComposite[i]) {

                for(int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for(int i = 2; i < n; i++) {
            if(!isComposite[i]) {
                count++;
            }
        }

        return count;
    }
}
