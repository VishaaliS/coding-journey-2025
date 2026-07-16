// Problem: Move Zeroes
// LeetCode: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 23, 2026

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
