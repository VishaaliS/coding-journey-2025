// Problem: First Unique Character in a String
// LeetCode 387: https://leetcode.com/problems/first-unique-character-in-a-string/
// Difficulty: Easy
// Pattern: Frequency Array + Single Pass
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 30, 2025
//
// APPROACH:
// First pass: Count frequency of all characters
// Second pass: Find first character with frequency = 1
// Return index, or -1 if none found

class Solution {
    public int firstUniqChar(String s) {
       int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1) return i; 
        }

        return -1;
    }
}
