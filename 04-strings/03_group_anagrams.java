/*
Problem: 49. Group Anagrams
Platform: LeetCode
Link: https://leetcode.com/problems/group-anagrams/
Difficulty: Medium
Pattern: Hash Table / Character Frequency

Time Complexity: O(n * k)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {

            int[] freq = new int[26];

            for(char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
