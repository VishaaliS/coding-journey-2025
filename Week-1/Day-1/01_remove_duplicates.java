// Problem: Remove Duplicates from Sorted Array
// LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 23, 2025

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) { 



            return 0;
        }
        int i = 0;
        int n = nums.length;
        for(int j = 1 ; j < n ; j++){
            if(nums[j]!= nums[i]){
               nums[i+1]=nums[j];
               i++;
            }
        }
        return i+1;



    }
}
