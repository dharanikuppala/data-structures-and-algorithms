/*
Problem: 148. Sort List
Platform: LeetCode
Link: https://leetcode.com/problems/sort-list/
Difficulty: Medium
Pattern: Merge Sort (Linked List)

Time Complexity: O(n log n)
Space Complexity: O(log n)  // recursion stack
*/

class Solution {

    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;  // break the list

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Merge sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    private ListNode getMid(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;  // mid node
    }
}
