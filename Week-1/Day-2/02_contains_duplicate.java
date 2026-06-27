// Problem: Contains Duplicate
// LeetCode 217: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Pattern: HashSet
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: June 24, 2025

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int j = 0 ; j < n ; j ++){
            
        
        if(set.contains(nums[j])){
        return true;}
       
            set.add(nums[j]);
        
    }
    return false;
    }
}
