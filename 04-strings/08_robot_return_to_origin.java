/*
Problem: 657. Robot Return to Origin
Platform: LeetCode
Difficulty: Easy
Pattern: Simulation / Coordinate Tracking

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean judgeCircle(String moves) {

        int x = 0;
        int y = 0;

        // Traverse each move
        for(char move : moves.toCharArray()){

            if(move == 'U'){
                y++;
            }
            else if(move == 'D'){
                y--;
            }
            else if(move == 'L'){
                x--;
            }
            else if(move == 'R'){
                x++;
            }
        }

        // Check if returned to origin
        return (x == 0 && y == 0);
    }
}
