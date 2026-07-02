// Problem: Two Sum
// LeetCode 1: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Pattern: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 3, 2025
//
// APPROACH:
// Use HashMap to store value -> index
// For each number, check if (target - number) exists in map
// Return indices if found

// REVISION: Solved in 2 minutes today
// Pattern is solid now

class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map <Integer ,Integer> ans = new HashMap<>();
      for(int i = 0 ; i < nums.length ; i ++){
       int x = target - nums[i] ;
       if(ans.containsKey(x))
       {
        return new int[] {ans.get(x),i};
       }
       ans.put(nums[i],i);
      }
      return null;
      
    }
}
