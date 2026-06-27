// Problem: Missing Number (Optimized with XOR)
// LeetCode 268: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Pattern: XOR Bit Manipulation
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 25, 2025
//
// WHY XOR OVER MATH FORMULA:
// Math formula n*(n+1)/2 can overflow with large numbers
// XOR has no overflow risk - works at bit level
// XOR all indices AND values = missing number remains
//
// HOW IT WORKS:
// a XOR a = 0 (same number cancels out)
// a XOR 0 = a (anything XOR zero = itself)

class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = n;
        for (int i = 0 ; i < n ; i++){
            sum = sum ^ nums[i];
            sum = sum ^ i;
        }
        
        return sum;
    }
}
