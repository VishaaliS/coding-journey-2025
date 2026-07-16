// Problem: Maximum Subarray (Kadane's Algorithm)
// LeetCode 53: https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium
// Pattern: Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2026

class Solution {
    public int maxSubArray(int[] nums) {
       int max = nums[0];
       int gmax = nums[0];
       for(int i = 1 ; i < nums.length ; i ++){

        if(max+nums[i] > nums[i] ){
             max = max+nums[i];
             
    }

    else{
        max = nums[i];
    }
    if(gmax < max ){ gmax = max;}
}
return gmax;
    }
}
