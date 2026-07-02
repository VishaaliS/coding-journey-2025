// Problem: Buddy Strings
// LeetCode 859: https://leetcode.com/problems/buddy-strings/
// Difficulty: Easy
// Pattern: String Comparison
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 3, 2025
//
// APPROACH:
// Check if exactly one swap makes strings equal
// Check for duplicate characters (allows same char swap)
// Find positions where characters differ
// Validate if swap works


class Solution {
    public boolean buddyStrings(String s, String goal) {
     if (s.length() != goal.length()) {
            return false;
        }
if (s.equals(goal)) {
    int[] freq = new int[26];

    for (char c : s.toCharArray()) {
        freq[c - 'a']++;
        if (freq[c - 'a'] > 1) {
            return true;
        }
    }
 return false;
  
}
int first = -1;
int second = -1;
 int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;

                if (count == 1) {
                    first = i;
                } else if (count == 2) {
                    second = i;
                } else {
                    return false;
                }
            }
        }
        return count == 2 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
}
