/*
Problem: 832. Flipping an Image
Platform: LeetCode
Link: https://leetcode.com/problems/flipping-an-image/
Difficulty: Easy
Pattern: Two Pointer + Bit Manipulation

Time Complexity: O(m * n)
Space Complexity: O(1)
*/

class Solution {

    public int[][] flipAndInvertImage(int[][] image) {

        for(int[] row : image) {

            int n = row.length;

            for(int i = 0; i < (n + 1) / 2; i++) {

                int temp = row[i] ^ 1;
                row[i] = row[n - 1 - i] ^ 1;
                row[n - 1 - i] = temp;
            }
        }

        return image;
    }
}
