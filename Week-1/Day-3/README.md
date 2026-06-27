# Day 3 - Optimization & Dutch National Flag

**Date:** June 25, 2025  
**Focus:** Optimizing previous solutions, XOR technique, Array as HashMap  

## What I Did Today

Today was about **going deeper, not wider**.  
Instead of rushing to new problems, I revisited Day 2 solutions  
and found better approaches. This is how real engineers think!

## Problems Solved / Reviewed

### 🔄 Re-solved: Missing Number (Optimized!)
**LeetCode 268** - [Link](https://leetcode.com/problems/missing-number/)
- **Day 2 approach:** Math formula n*(n+1)/2
  - Works but can overflow with very large numbers
- **Day 3 approach:** XOR method ← BETTER!
  - No overflow risk
  - Time: O(n), Space: O(1)
- **Key insight:** XOR same number twice = 0
  - XOR all indices AND all values
  - The missing number remains!

### 🔄 Reviewed: Single Number
**LeetCode 136** - [Link](https://leetcode.com/problems/single-number/)
- Reviewed to strengthen XOR understanding
- This was the foundation for optimizing Missing Number
- Pattern: a XOR a = 0, a XOR 0 = a

### ✅ New: Sort Colors
**LeetCode 75** - [Link](https://leetcode.com/problems/sort-colors/)
- Pattern: Dutch National Flag Algorithm
- Difficulty: Medium
- Three pointers: low, mid, high
- Sort array of 0s, 1s, 2s in ONE pass
- Time: O(n), Space: O(1)

## 📚 New Concept Learned: Array as HashMap

**What is it?**  
Using array indices as keys to count/track elements.  
Instead of creating a HashMap, use the array index directly!

**Example:**
```java
// Count frequency of numbers 0-9
int[] freq = new int[10];
for (int num : nums) {
    freq[num]++;  // index = key, value = count
}
