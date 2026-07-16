// Problem: Longest Substring Without Repeating Characters
// LeetCode 3: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Difficulty: Medium
// Pattern: Sliding Window + HashSet
// Time Complexity: O(n)
// Space Complexity: O(min(n, charset))
// Date: July 6, 2026
//
// APPROACH:
// Variable window with HashSet
// Track characters in current window
// Shrink when duplicate found
// Return max window size

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map <Character , Integer> ans = new HashMap<>();
        
        int i = 0;
        int j = 0;
        int maxcount = 0;
        while(i < s.length()){

                while(ans.containsKey(s.charAt(i))){
                    ans.remove(s.charAt(j));
                    j++;
                }
            
           
            ans.put(s.charAt(i),i);
             maxcount = Math.max(maxcount , i-j+1);
            i++;
        }
     return maxcount;
    }
}
