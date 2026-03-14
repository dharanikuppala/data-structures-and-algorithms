/*
Problem: 344. Reverse String
Platform: LeetCode
Difficulty: Easy
Pattern: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {

    public void reverseString(char[] s) {

        if(s.length <= 1){
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while(left < right){

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}
