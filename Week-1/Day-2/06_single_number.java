/ Problem: Single Number
// LeetCode 136: https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Pattern: Bit Manipulation (XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2025

class Solution {
    public int singleNumber(int[] nums) {
    int k = 0;
for(int i = 0; i < nums.length; i++) {
k = k ^ nums[i];
}
return k;
    }
}
