/*
Problem: 49. Group Anagrams
Platform: LeetCode
Difficulty: Medium
Pattern: Hash Table / Sorting

Time Complexity: O(n * k log k)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        for(String element : strs){

            // Convert string to character array
            char[] schar = element.toCharArray();

            // Sort characters
            Arrays.sort(schar);

            // Create key from sorted characters
            String current = new String(schar);

            // If key not present, create new list
            if(!map.containsKey(current)){
                map.put(current, new ArrayList<>());
            }

            // Add original word to the list
            map.get(current).add(element);
        }

        return new ArrayList<>(map.values());
    }
}
