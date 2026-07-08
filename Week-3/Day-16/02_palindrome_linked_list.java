// Problem: Palindrome Linked List
// LeetCode 234: https://leetcode.com/problems/palindrome-linked-list/
// Difficulty: Easy
// Pattern: Fast/Slow Pointer + Reverse
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 8, 2025
//
// APPROACH:
// 1. Find middle using fast/slow pointer
// 2. Reverse second half of list
// 3. Compare first half with reversed second half
// 4. If all match → palindrome
//
// 30-min rule applied (25 mins - harder problem)

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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = head;
        while(prev != null){
            if(temp.val == prev.val){
                temp = temp.next;
                prev = prev.next;
            }
            else {return false;}
        }
        return true;
    }
}
