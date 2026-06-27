// Problem: Rotate Array
// LeetCode 189: https://leetcode.com/problems/rotate-array/
// Difficulty: Medium
// Pattern: Array Rotation (Reversal Technique)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2025

class Solution {
    public static void reverse (int [] nums , int start , int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
        }
    
    public void rotate(int[] nums, int k) {
      
        int n = nums.length;
        k = k % n;
       reverse(nums , 0 , n-k-1);
       reverse(nums , n-k , n-1);
       reverse(nums , 0 , n-1);

    }
}
