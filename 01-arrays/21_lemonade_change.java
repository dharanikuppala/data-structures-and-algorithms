/*
Problem: 860. Lemonade Change
Platform: LeetCode
Difficulty: Easy
Pattern: Greedy / Simulation

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean lemonadeChange(int[] bills) {

        int fives = 0;
        int tens = 0;

        for(int bill : bills){

            if(bill == 5){
                fives++;
            }
            else if(bill == 10){
                tens++;
                fives--;
            }
            else{ // bill == 20

                if(tens > 0){
                    tens--;
                    fives--;
                }
                else{
                    fives -= 3;
                }
            }

            // If at any point we can't give change
            if(fives < 0){
                return false;
            }
        }

        return true;
    }
}
