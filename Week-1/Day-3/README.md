# Day 3 - Optimization, XOR & Index Marking Algorithm

**Date:** June 25, 2026  
**Focus:** Optimizing previous solutions, learning Index Marking technique  

## What I Did Today

Today was about **going deeper, not wider.**  
Revisited previous solutions, found better approaches,  
and learned a completely new algorithm concept.  
This is how real engineers think!

## Problems Solved

### 🔄 Re-solved with Optimization: Missing Number
**LeetCode 268** - [Link](https://leetcode.com/problems/missing-number/)

| | Day 2 | Day 3 |
|--|-------|-------|
| Approach | Math: n*(n+1)/2 | XOR method |
| Risk | Can overflow large numbers | No overflow |
| Speed | O(n) | O(n) |
| Space | O(1) | O(1) |

**Why XOR is better:**
- Math formula can overflow with very large numbers
- XOR works at bit level, no overflow risk
- XOR all indices AND all values = missing number remains

### 🔄 Reviewed: Single Number
**LeetCode 136** - [Link](https://leetcode.com/problems/single-number/)
- Reviewed to strengthen XOR understanding
- Foundation for solving Missing Number with XOR
- Core rule: a XOR a = 0, a XOR 0 = a

### ✅ New Problem: Sort Colors
**LeetCode 75** - [Link](https://leetcode.com/problems/sort-colors/)
- Pattern: Dutch National Flag Algorithm
- Difficulty: Medium
- Three pointers: low, mid, high
- Sorts array of 0s, 1s, 2s in ONE single pass
- Time: O(n), Space: O(1)

## 📚 New Algorithm Learned: Index Marking (Negative Marking)

**Concept:** Use the array itself as a HashMap by marking indices negative

**How it works:**
```java
// Array: [3, 4, 0, 1, 2]
// Goal: Find first missing positive number

// Step 1: When you SEE number 1
//         Go to INDEX 1 and mark it negative
// Step 2: When you SEE number 2  
//         Go to INDEX 2 and mark it negative
// Step 3: Scan array - first POSITIVE index = missing number!

// Index:  0   1   2   3   4
// Array: [3, -4,  0, -1, -2]  ← after marking
//                              index 2 is positive = 2 is missing!

// Why I didn't solve it yet:
// I found a real edge case that needed more thought:

// Problem: What if a number is ALREADY negative in the array?

// Example: [-15, 2, 3, ...]
// - Index 0 already has -15 (original negative value)
// - But I did NOT mark it negative
// - During scanning: how do I know if negative means
//  "I marked this" OR "it was already negative"?


This is a valid edge case!
The real solution handles this by:

First removing all negatives and zeros (they can't be answers)
Then applying the marking technique
Will solve LeetCode 41 (First Missing Positive) after
reflecting more on this edge case.

Critical Thinking Moment 🧠
Most people learn an algorithm and immediately try to code it.
Today I learned to pause and question:

What are the edge cases?
What assumptions does this algorithm make?
What breaks this algorithm?
This kind of thinking is what separates good developers
from great ones!

Key Learnings
XOR is safer than math formula for large numbers
Dutch National Flag solves 3-value sorting in one pass
Index Marking = use array as HashMap (no extra space!)
Always ask: what are the edge cases?
It is okay to learn an algorithm without solving it immediately
Total Problems Solved So Far: 12

