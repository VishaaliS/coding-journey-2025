// Problem: Squares of a Sorted Array
// LeetCode 977: https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty: Easy
// Pattern: Two Pointer (from both ends)
// Time Complexity: O(n)
// Space Complexity: O(1) excluding output
// Date: June 27, 2025
//
// KEY INSIGHT:
// Largest squares are at BOTH ends (negative² = large, positive² = large)
// Use two pointers from start and end
// Fill result array from back to front

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int[nums.length];
        int i = 0 ;
        int k = nums.length -1;
        int j = nums.length -1;
        while(j >= 0 ){
            if (Math.abs(nums[k]) <= Math.abs(nums[i])){
                ans[j] = nums[i]*nums[i];
                i ++;
               
            }
            else{
                ans[j] = nums[k]*nums[k];
                k --;
            }
        j -- ;
        }
return ans;
    }
}
