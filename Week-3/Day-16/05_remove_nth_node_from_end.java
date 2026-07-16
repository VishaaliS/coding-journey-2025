// Problem: Remove Nth Node From End of List
// LeetCode 19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Pattern: Two Pointer with Gap
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 8, 2026
//
// APPROACH:
// Use dummy node (handles edge case of removing head)
// Move fast pointer N steps ahead
// Move both pointers until fast reaches end
// Slow pointer is now at (N-1)th from end
// Skip the Nth node: slow.next = slow.next.next

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode temp = head;
        int i = 0;
        int count = 0;
        
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        
       
        int k = count - n;
        if(k == 0){
            return head.next;
        }
        while(i < k-1){
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
}
