/ Problem: Remove Duplicates from Sorted List
// LeetCode 83: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Difficulty: Easy
// Pattern: Traversal + Skip Nodes
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 8, 2025
//
// APPROACH:
// Traverse the list
// If curr.val == curr.next.val → skip next node
// curr.next = curr.next.next
// Continue until end

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
            curr = curr.next;}
        }
        return head;
    }
}
