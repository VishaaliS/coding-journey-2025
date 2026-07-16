// Problem: Maximum Average Subarray I
// LeetCode 643: https://leetcode.com/problems/maximum-average-subarray-i/
// Difficulty: Easy
// Pattern: Sliding Window (Fixed Size K)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 6, 2026
//
// APPROACH:
// Fixed window size K
// Slide window across array
// Track sum, calculate average
// Return maximum average


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 ;
        int i = 0;
        while(i < k){
            sum = sum + nums[i];
            i++;
        }
        int j = 0 ;
        int maxsum = sum ;
        while(i < nums.length){
            sum = sum - nums[j];
            sum = sum + nums[i];
            j++;
            i++;
            maxsum = Math.max(maxsum , sum);
        }
        return (double) maxsum/k ;
    }
}
