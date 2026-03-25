/*
Problem: 19. Remove Nth Node From End of List
Platform: LeetCode
Difficulty: Medium
Pattern: Two Pointers / Fast & Slow

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move fast pointer n+1 steps ahead
        for(int i = 1; i <= n + 1; i++){
            fast = fast.next;
        }

        // Move both pointers
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
