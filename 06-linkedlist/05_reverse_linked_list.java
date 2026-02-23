/*
Problem: 206. Reverse Linked List
Platform: LeetCode
Link: https://leetcode.com/problems/reverse-linked-list/
Difficulty: Easy
Pattern: Linked List Reversal (Three Pointer)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {

            ListNode next = current.next;  // store next node
            current.next = prev;           // reverse link

            prev = current;                // move prev forward
            current = next;                // move current forward
        }

        return prev;
    }
}
