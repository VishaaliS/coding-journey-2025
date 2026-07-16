// Problem: 4Sum II
// LeetCode 454: https://leetcode.com/problems/4sum-ii/
// Difficulty: Medium
// Pattern: HashMap + Nested Loops
// Time Complexity: O(n²)
// Space Complexity: O(n²)
// Date: July 3, 2026
//
// KEY LEARNING:
// Initially thought O(n) was optimal
// Learned O(n²) is actually optimal for this problem
// Don't over-optimize before understanding constraints
//
// APPROACH:
// Store all sums of nums1 + nums2 in HashMap
// For each sum of nums3 + nums4, check if (0 - sum) exists
// Count matches

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map <Integer , Integer> ans = new HashMap<>();
        int count = 0;
      for(int i = 0 ; i < nums1.length ; i ++){
        for(int j = 0 ; j < nums2.length; j++){
            int x = nums1[i] + nums2[j];
            ans.put(x , ans.getOrDefault(x, 0) + 1);
      }}
       
      for(int k = 0 ; k < nums3.length ; k ++){
        for(int l = 0 ; l < nums4.length; l++){
            int m = nums3[k] + nums4[l];
            if(ans.containsKey(-(m))){
                count = count + ans.get(-(m)) ;
                
            }
    }
    }
    return count ;
}}
