// Problem: Majority Element
// LeetCode 169: https://leetcode.com/problems/majority-element/
// Difficulty: Easy
// Pattern: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2026

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
         if(candidate == nums[i]){
            count ++;
         }
         else{count --;}
         if(count == 0){
            candidate = nums[i];
            count += 1;
         }
        }
        return candidate;
    }
}
