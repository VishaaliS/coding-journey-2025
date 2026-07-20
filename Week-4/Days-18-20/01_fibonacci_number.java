// Problem: Fibonacci Number
// LeetCode 509: https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Pattern: Recursion (Classic)
// Time Complexity: O(2^n) - not optimal, but learning recursion
// Space Complexity: O(n) - call stack
// Date: July 19, 2026
//
// APPROACH:
// Base case: if n <= 1, return n
// Recursive case: fib(n-1) + fib(n-2)
//
// First recursion problem - took 50 minutes
// Still learning to trust the recursion


class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
