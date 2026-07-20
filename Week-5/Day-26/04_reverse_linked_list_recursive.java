// Problem: Reverse Linked List (Recursive Approach)
// LeetCode 206: https://leetcode.com/problems/reverse-linked-list/
// Difficulty: Easy
// Pattern: Recursion on Linked List
// Time Complexity: O(n)
// Space Complexity: O(n) - call stack
// Date: July 20, 2026
//
// APPROACH:
// Base case: if head == null or head.next == null, return head
// Recursive case:
//   - Reverse rest of list: newHead = reverseList(head.next)
//   - Fix current node's pointer: head.next.next = head
//   - Set current node's next to null: head.next = null
//   - Return newHead
//
// Previously solved iteratively (Day 15)
// Recursion much harder to visualize - took 1hr 20 min
// Still struggling to "trust the recursion"


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
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        return newhead; 
    }
}
