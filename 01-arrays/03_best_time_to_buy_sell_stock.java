/*
Problem: 121. Best Time to Buy and Sell Stock
Platform: LeetCode
Difficulty: Easy
Pattern: Greedy (Running Minimum)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int price : prices) {

            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
