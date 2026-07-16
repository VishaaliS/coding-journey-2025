// Problem: Remove All Adjacent Duplicates in String
// LeetCode 1047: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// Difficulty: Easy
// Pattern: Stack (Character Matching)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 9, 2026
//
// APPROACH:
// Iterate through string
// If stack is empty or top != current char → push
// If top == current char → pop (remove duplicate pair)
// Build result from stack

class Solution {
        public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : st) {
            ans.append(ch);
        }

        return ans.toString();
 }}
