/*
Problem: 141. Linked List Cycle
Platform: LeetCode
Link: https://leetcode.com/problems/linked-list-cycle/
Difficulty: Easy
Pattern: Fast & Slow Pointer (Floyd’s Algorithm)

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
