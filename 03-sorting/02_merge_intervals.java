/*
Problem: 56. Merge Intervals
Platform: LeetCode
Difficulty: Medium
Pattern: Sorting / Interval Merging

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] current = intervals[0];
        list.add(current);

        // Step 2: Traverse intervals
        for(int[] interval : intervals){

            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            // Step 3: Check overlap
            if(currentEnd >= nextStart){
                current[1] = Math.max(currentEnd, nextEnd);
            }
            else{
                current = interval;
                list.add(current);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
