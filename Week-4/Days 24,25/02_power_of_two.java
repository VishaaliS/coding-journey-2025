// Problem: Power of Two
// LeetCode 231: https://leetcode.com/problems/power-of-two/
// Difficulty: Easy
// Pattern: Recursion
// Time Complexity: O(log n)
// Space Complexity: O(log n) - call stack
// Date: July 19, 2026
//
// APPROACH:
// Base case: if n == 1, return true (2^0 = 1)
// Base case: if n <= 0 or n % 2 != 0, return false
// Recursive case: powerOfTwo(n / 2)
//
// Took 52 minutes - recursion still confusing

class Solution {
    public boolean isPowerOfTwo(int n) {
        if( n == 1 ){return true;}
        if(n <= 0){
            return false;
        }
      if(n%2 != 0){
        return false;
      }  
      return isPowerOfTwo(n/2);
    }
}
