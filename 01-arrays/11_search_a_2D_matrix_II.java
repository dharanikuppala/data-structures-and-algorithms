/*
Problem: 240. Search a 2D Matrix II
Platform: LeetCode
Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
Difficulty: Medium
Pattern: Matrix Search / Staircase Search

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {

            if(matrix[row][col] > target) {
                col--;
            } 
            else if(matrix[row][col] < target) {
                row++;
            } 
            else {
                return true;
            }
        }

        return false;
    }
}
