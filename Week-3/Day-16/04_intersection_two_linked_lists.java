// Problem: Intersection of Two Linked Lists
// LeetCode 160: https://leetcode.com/problems/intersection-of-two-linked-lists/
// Difficulty: Easy
// Pattern: Two Pointer (Switch Lists)
// Time Complexity: O(n+m)
// Space Complexity: O(1)
// Date: July 8, 2025
//
// APPROACH:
// Two pointers traverse both lists
// When pointer reaches end, switch to other list's head
// This equalizes path lengths
// Pointers meet at intersection or NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int count1 = 0;
        int count2 = 0;
        ListNode start1 = headA;
        ListNode start2 = headB;
        while(temp1 != null){
…               start1 = start1.next;
               i++;
            }
        }
        else{
            int mov = count2 - count1;
            int j = 0;
            while(j < mov){
               start2 = start2.next;
               j++;
            }
        }
        while(start1 != null && start2 != null){
            if(start1 == start2){
                return start1;
            }
            start1 = start1.next;
            start2 = start2.next;
        }
        return null;
    }
}
