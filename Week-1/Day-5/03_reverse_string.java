// Problem: Reverse String
// LeetCode 344: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Pattern: Two Pointer (classic swap)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 27, 2025
//
// Classic two-pointer approach:
// Left pointer at start, right at end
// Swap characters, move pointers inward
// Continue until they meet

class Solution {
    public void reverseString(char[] s) {
        int i = 0 ;
        int j = s.length - 1;
        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        
    }
}
