// Problem: Linked List Cycle
// LeetCode 141: https://leetcode.com/problems/linked-list-cycle/
// Difficulty: Easy
// Pattern: Fast/Slow Pointer (Floyd's Cycle Detection)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 7, 2025
//
// APPROACH:
// Fast pointer moves 2 steps
// Slow pointer moves 1 step
// If they meet → cycle exists
// If fast reaches NULL → no cycle
//
// WHY IT WORKS:
// In a cycle, fast pointer eventually catches slow pointer
// Like running on a circular track at different speeds

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){return true;}
        }
        return false;
    }
}
