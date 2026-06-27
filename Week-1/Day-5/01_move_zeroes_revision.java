// Problem: Move Zeroes (Revision from Day 1)
// LeetCode 283: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 27, 2025
//
// Day 1: First time solving - 10 mins
// Day 5: Revision - 10 mins (pattern locked in!)

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(int j = 0; j<n ;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
while(i<n){
    nums[i]=0;
    i++;
}
}
}
