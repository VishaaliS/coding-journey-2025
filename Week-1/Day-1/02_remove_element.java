// Problem: Remove Element
// LeetCode: https://leetcode.com/problems/remove-element/
// Difficulty: Easy
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 23, 2025

class Solution {
    public int removeElement(int[] nums, int val) {
       int i = 0;
       int n = nums.length;
       for(int j =0 ;j<n;j++ ){
        if (nums[j] != val){
            nums[i]=nums[j];
            i++;
        }
       }
       return i; 
    }
}
