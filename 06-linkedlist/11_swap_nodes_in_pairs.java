/*
Problem: 24. Swap Nodes in Pairs
Platform: LeetCode
Difficulty: Medium
Pattern: Linked List / Pointer Manipulation

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode swapPairs(ListNode head) {

        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while(current.next != null && current.next.next != null){

            // Identify nodes to swap
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move pointer to next pair
            current = first;
        }

        return dummy.next;
    }
}
