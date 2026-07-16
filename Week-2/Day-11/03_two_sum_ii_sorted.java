// Problem: Two Sum II - Input Array Is Sorted
// LeetCode 167: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Difficulty: Easy
// Pattern: Two Pointer (Sorted Array Optimization)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: July 4, 2026
//
// APPROACH:
// Sorted array enables O(n) two-pointer (not HashMap)
// Two pointers from both ends
// Squeeze inward until target is found
// If sum too small → move left pointer right
// If sum too large → move right pointer left
//
// Example: numbers = [2,7,11,15], target = 9
// Output: [1,2] (indices 1 and 2 → values 2 and 7)
//
// KEY INSIGHT: Constraint (sorted) enables optimization!

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
         int sum = numbers[i] + numbers[j];
         if(sum == target){return new int[] {i+1,j+1};}
         else if(sum < target){i++;}
         else if(sum > target){j--;}
        }
        return new int[] {};
        }
    }

