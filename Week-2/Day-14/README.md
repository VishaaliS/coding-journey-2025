# Day 14 - Sliding Window Mastery

**Date:** July 6, 2025  
**Focus:** Sliding window pattern (fixed and variable windows)

## Problems Solved: 4

### 1. Maximum Average Subarray I
**LeetCode 643** - [Link](https://leetcode.com/problems/maximum-average-subarray-i/)
- Pattern: Fixed window size K
- Difficulty: Easy
- Time: 15 minutes
- Approach: Slide window, track sum, calculate average

### 2. Max Consecutive Ones III
**LeetCode 1004** - [Link](https://leetcode.com/problems/max-consecutive-ones-iii/)
- Pattern: Variable window
- Difficulty: Medium
- Time: 20 minutes
- Approach: Expand while flips ≤ K, shrink when exceed

### 3. Longest Substring Without Repeating Characters
**LeetCode 3** - [Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- Pattern: Variable window + HashSet
- Difficulty: Medium
- Time: 25 minutes
- Approach: Track characters in HashSet, shrink when duplicate found

### 4. Longest Repeating Character Replacement
**LeetCode 424** - [Link](https://leetcode.com/problems/longest-repeating-character-replacement/)
- Pattern: Variable window + Frequency array
- Difficulty: Hard
- Time: 30 minutes (hit 30-min rule)
- Approach: Track max frequency character, expand window while valid

---

## Pattern Recognition: Sliding Window

**Fixed window (Problem 1):**
- Window size K is given
- Slide window across array
- Track sum/average/max

**Variable window (Problems 2, 3, 4):**
- Window expands (add elements)
- Window shrinks when constraint violated
- Track maximum window size

**Key insight:** Recognize fixed vs variable window from problem statement.

---

## New Pattern Unlocked: Sliding Window ✅

Added to toolkit:
- ✅ Two Pointer
- ✅ Frequency Array
- ✅ XOR
- ✅ HashMap
- ✅ **Sliding Window** (NEW!)

---

## Stats

| Metric | Count |
|--------|-------|
| Problems solved today | 4 |
| Total problems | ~41 |
| New pattern learned | Sliding Window |
| Time per problem | 15-30 mins |
| Day | 14/180 |

---

**Day 14/180 ✅**
