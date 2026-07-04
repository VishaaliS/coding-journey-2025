// Problem: Roman to Integer
// LeetCode 13: https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Pattern: String Parsing + Logic
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 5, 2025
//
// APPROACH:
// Iterate through roman numeral string
// If current value < next value → subtract (IV = 4)
// Otherwise → add (VI = 6)
//
// Solved today to maintain streak despite Azure struggles


class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                curr < map.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}
