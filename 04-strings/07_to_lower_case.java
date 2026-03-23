/*
Problem: 709. To Lower Case
Platform: LeetCode
Difficulty: Easy
Pattern: String Manipulation / ASCII

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public String toLowerCase(String str) {

        String result = "";

        for(char c : str.toCharArray()){

            // Check if character is uppercase
            if(Character.isUpperCase(c)){
                result = result + (char)(c + 32);
            }
            else{
                result = result + c;
            }
        }

        return result;
    }
}
