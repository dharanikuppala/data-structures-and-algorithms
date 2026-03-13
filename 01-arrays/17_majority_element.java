/*
Problem: 169. Majority Element
Platform: LeetCode
Difficulty: Easy
Pattern: Frequency Counting

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer, Integer> hash = new HashMap<>();
      int value = 0;
      int majority = 0;
      for(int n : nums){
        hash.put(n, 1 + hash.getOrDefault(n, 0));
        if(hash.get(n) > majority){
            value = n;
            majority = hash.get(n);
        }
      }
      return value;
    }
}
