// Problem: Longest Repeating Character Replacement
// LeetCode 424: https://leetcode.com/problems/longest-repeating-character-replacement/
// Difficulty: Hard
// Pattern: Sliding Window + Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 6, 2026
//
// APPROACH:
// Variable window with frequency array
// Track max frequency character
// Expand while (window size - max freq) ≤ K
// Shrink when constraint violated
// 30-min rule applied - got 70% understanding

class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq = new int[26];

        int i = 0;
        int j = 0;
        int length = 0;

        while (i < s.length()) {

            freq[s.charAt(i) - 'A']++;

            int maxFreq = 0;
            for (int count : freq) {
                maxFreq = Math.max(maxFreq, count);
            }

            int length1 = i - j + 1;

            while (length1 - maxFreq > k) {
                freq[s.charAt(j) - 'A']--;
                j++;
                maxFreq = 0;
                for (int count : freq) {
                    maxFreq = Math.max(maxFreq, count);
                }

                length1 = i - j + 1;
            }

            length = Math.max(length, length1);

            i++;
        }

        return length;
    }
}
