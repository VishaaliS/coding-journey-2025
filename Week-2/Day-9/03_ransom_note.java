// Date: 01.07.2026
// Day: 9
// Problem: Ransom Note
// LeetCode 383: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Pattern: Frequency Array
// Time Complexity: O(n+m)
// Space Complexity: O(1)
// Date: July 2, 2026
//
// APPROACH:
// Count frequency of available characters
// For each character in ransom note:
//   - Check if available (count > 0)
//   - Decrease count if available
//   - Return false if not available
//
// WHY FREQUENCY ARRAY:
// Learned this painfully on Day 7
// Now automatic, can apply in 5 minutes
// Pattern recognition working!

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i = 0 ; i < ransomNote.length() ; i ++){
            int k = (int)ransomNote.charAt(i) - (int)'a';
            arr[k] += 1;
            }
        for(int i = 0 ; i < magazine.length() ; i ++){
            int k = (int)magazine.charAt(i) - (int)'a';
            arr[k] -= 1;
            }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] > 0 ){
                return false;
            }}
        return true;
        }
}

