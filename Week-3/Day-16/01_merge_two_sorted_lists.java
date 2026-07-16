// Problem: Merge Two Sorted Lists
// LeetCode 21: https://leetcode.com/problems/merge-two-sorted-lists/
// Difficulty: Easy
// Pattern: Dummy Node + Two Pointer
// Time Complexity: O(n+m)
// Space Complexity: O(1)
// Date: July 8, 2026
//
// APPROACH:
// Create dummy node
// Compare nodes from both lists
// Attach smaller node to result
// Move pointer forward
// Return dummy.next

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode newnode = new ListNode();
        ListNode head = newnode;
       
       …  newnode = newnode.next;
           }
           else{
            
            newnode.next = temp2;
            temp2 = temp2.next;
            newnode = newnode.next;
           }
       } 
       while(temp1 != null){
        
        newnode.next = temp1;
        temp1 = temp1.next;
        newnode = newnode.next;
       }
       while(temp2 != null){
        
        newnode.next = temp2;
        temp2 = temp2.next;
        newnode = newnode.next;
       }
       return head.next;
    }
}
