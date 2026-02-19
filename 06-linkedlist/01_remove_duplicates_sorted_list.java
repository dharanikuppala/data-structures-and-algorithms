/*
Problem: 83. Remove Duplicates from Sorted List
Platform: LeetCode
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
Difficulty: Easy
Pattern: Linked List Traversal

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode current = head;

        while(current.next != null) {

            if(current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
