// Problem: Missing Number
// LeetCode 268: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Pattern: Math Formula (or XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2026

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int k = (n*(n+1))/2;
        for (int i = 0 ; i < n ; i++){
            sum += nums[i];
        }
        
        return k-sum;
    }
}
