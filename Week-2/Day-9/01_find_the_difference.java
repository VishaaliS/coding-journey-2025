// Date: 01.07.2026
//Day: 9
// Problem: Find the Difference
// LeetCode 389: https://leetcode.com/problems/find-the-difference/
// Difficulty: Easy
// Pattern: XOR Bit Manipulation
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 2, 2026
//
// APPROACH:
// XOR all characters in both strings
// Matching characters cancel out (a XOR a = 0)
// The extra character remains
//
// WHY THIS WORKS:
// This XOR approach "failed" on anagrams Day 7
// But it's PERFECT for finding a single different character!

class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        int i = 0;
      while( i < s.length()){
       xor = xor ^ (int)t.charAt(i);
       xor = xor ^ (int)s.charAt(i);
       i++;
      } 
      
        xor = xor ^ (int)t.charAt(i); 
    
    return (char)xor;
    }
}
