/*
Problem: 21. Merge Two Sorted Lists
Platform: LeetCode
Link: https://leetcode.com/problems/merge-two-sorted-lists/
Difficulty: Easy
Pattern: Two Pointer (Linked List Merge)

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null) {

            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
