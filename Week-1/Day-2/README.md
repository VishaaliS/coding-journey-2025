# Day 2 - Arrays Advanced & Multiple Algorithms

**Date:** June 24, 2025  
**Focus:** Rotation, Kadane's Algorithm, Boyer-Moore Voting, Merge Arrays  

## Problems Solved

1. **Rotate Array** - [LeetCode 189](https://leetcode.com/problems/rotate-array/)
   - Pattern: Array Rotation (reversal technique)
   - Difficulty: Medium
   - Key Insight: Use k % n to handle rotations > array length

2. **Contains Duplicate** - [LeetCode 217](https://leetcode.com/problems/contains-duplicate/)
   - Pattern: HashSet
   - Difficulty: Easy
   - Key Insight: HashSet automatically ignores duplicates

3. **Best Time to Buy and Sell Stock** - [LeetCode 121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
   - Pattern: Single pass, track minimum price
   - Difficulty: Easy
   - Key Insight: Track minimum price seen so far

4. **Maximum Subarray** - [LeetCode 53](https://leetcode.com/problems/maximum-subarray/)
   - Pattern: Kadane's Algorithm
   - Difficulty: Medium
   - Key Insight: Reset sum when it goes negative

5. **Merge Sorted Array** - [LeetCode 88](https://leetcode.com/problems/merge-sorted-array/)
   - Pattern: Two Pointer (from the end)
   - Difficulty: Easy
   - Key Insight: Fill from back to avoid overwriting elements

6. **Single Number** - [LeetCode 136](https://leetcode.com/problems/single-number/)
   - Pattern: Bit Manipulation (XOR)
   - Difficulty: Easy
   - Key Insight: XOR of same numbers = 0

7. **Majority Element** - [LeetCode 169](https://leetcode.com/problems/majority-element/)
   - Pattern: Boyer-Moore Voting Algorithm
   - Difficulty: Easy
   - Key Insight: Cancel out different elements

8. **Missing Number** - [LeetCode 268](https://leetcode.com/problems/missing-number/)
   - Pattern: Math (Sum formula) or XOR
   - Difficulty: Easy
   - Key Insight: Expected sum minus actual sum = missing number

## Key Learnings

- Kadane's Algorithm for maximum subarray sum
- Boyer-Moore Voting Algorithm for majority element
- Array rotation using reversal technique (3 reversals)
- XOR trick for finding single/missing numbers
- Two pointer from the end for merge problems

## Patterns Learned Today

| Pattern | Problem | Key Idea |
|---------|---------|----------|
| Array Rotation | Rotate Array | Reverse entire, then parts |
| HashSet | Contains Duplicate | O(1) lookup |
| Single Pass | Buy/Sell Stock | Track min as you go |
| Kadane's Algorithm | Maximum Subarray | Reset when sum goes negative |
| Two Pointer | Merge Sorted Array | Fill from back |
| XOR Bit Magic | Single Number | a XOR a = 0 |
| Boyer-Moore | Majority Element | Vote cancellation |
| Math Formula | Missing Number | n*(n+1)/2 - actual sum |

## Total Problems Solved So Far: 11
