// Problem: Valid Anagram
// LeetCode 242: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Pattern: Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 30, 2025
//
// APPROACH:
// Count frequency of characters in both strings
// Compare frequency arrays
// If all frequencies match = anagram
//
// WHY NOT XOR:
// XOR cancels out matching pairs
// But anagrams need CHARACTER COUNT, not just presence


class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

    int[] freq = new int[26];

    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
        freq[t.charAt(i) - 'a']--;
    }

    for (int x : freq) {
        if (x != 0) return false;
    }

    return true;
    }
}
