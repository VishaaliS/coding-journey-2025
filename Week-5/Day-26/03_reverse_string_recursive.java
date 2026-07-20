// Problem: Reverse String (Recursive Approach)
// LeetCode 344: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Pattern: Recursion (Swap and Recurse)
// Time Complexity: O(n)
// Space Complexity: O(n) - call stack
// Date: July 20, 2026
//
// APPROACH:
// Base case: if left >= right, return
// Recursive case: 
//   - Swap s[left] and s[right]
//   - Recurse on middle portion (left+1, right-1)
//
// Previously solved with two pointers (Day 9)
// This time using recursion - took 45 minutes

class Solution {
   
    public void reverseString(char[] s) {
       reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int i, int j) {
        if (i >= j) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverse(s, i + 1, j - 1);
    }
        
    }

