// Problem: Max Consecutive Ones III
// LeetCode 1004: https://leetcode.com/problems/max-consecutive-ones-iii/
// Difficulty: Medium
// Pattern: Sliding Window (Variable)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 6, 2026
//
// APPROACH:
// Variable window
// Expand while flips ≤ K
// Shrink when flips exceed K
// Track maximum window size

class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int zeros = 0;
        int maxLength = 0;

        while (i < nums.length) {

            if (nums[i] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[j] == 0) {
                    zeros--;
                }
                j++;
            }

            maxLength = Math.max(maxLength, i - j + 1);
            i++;
        }

        return maxLength;
    }
}
