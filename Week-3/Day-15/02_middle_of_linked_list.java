// Problem: Middle of the Linked List
// LeetCode 876: https://leetcode.com/problems/middle-of-the-linked-list/
// Difficulty: Easy
// Pattern: Fast/Slow Pointer (Tortoise and Hare)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 7, 2025
//
// APPROACH:
// Fast pointer moves 2 steps
// Slow pointer moves 1 step
// When fast reaches end, slow is at middle
//
// Example:
// 1 → 2 → 3 → 4 → 5
// Fast: 1 → 3 → 5 (end)
// Slow: 1 → 2 → 3 (middle)

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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        count = count / 2;

        ListNode temp1 = head;
        for(int i = 0 ; i < count ; i++){
           temp1 = temp1.next;
        }
        return temp1;
    }
}
