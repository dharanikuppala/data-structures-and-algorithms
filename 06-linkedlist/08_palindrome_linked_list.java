/*
Problem: 234. Palindrome Linked List
Platform: LeetCode
Difficulty: Easy
Pattern: Fast & Slow + Reverse List

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;

        // Step 1: Find middle
        ListNode mid = middleNode(head);

        // Step 2: Reverse second half
        ListNode secondHalf = reverseList(mid);

        // Store copy to restore later
        ListNode copySecondHalf = secondHalf;

        // Step 3: Compare both halves
        ListNode firstHalf = head;
        boolean isPalindrome = true;

        while(secondHalf != null) {
            if(firstHalf.val != secondHalf.val) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Step 4: Restore list (optional but good practice)
        reverseList(copySecondHalf);

        return isPalindrome;
    }

    private ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
