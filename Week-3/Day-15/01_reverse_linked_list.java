// Problem: Reverse Linked List
// LeetCode 206: https://leetcode.com/problems/reverse-linked-list/
// Difficulty: Easy
// Pattern: Pointer Manipulation
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 7, 2025
//
// APPROACH:
// Three pointers: prev, current, next
// Iteratively reverse links
// Update pointers: current.next = prev
// Move pointers forward until end
// Return new head (prev)
//
// Today: Learned linked list fundamentals before solving
// Foundation day, not grinding day

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
