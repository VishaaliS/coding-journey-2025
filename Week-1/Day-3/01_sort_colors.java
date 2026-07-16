// Problem: Sort Colors
// LeetCode 75: https://leetcode.com/problems/sort-colors/
// Difficulty: Medium
// Pattern: Dutch National Flag Algorithm
// Three Pointers: low, mid, high
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 25, 2026

class Solution {
    public void sortColors(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        int k = 0;
       while(k <= j){
          if(nums[k] == 0){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            i++;
            k++;

          }
          else if(nums[k] == 2){
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
            j--;
          }
          else{k++;}
       }
    }
}
