# Day 7 - String Fundamentals & Two Pointer Returns

**Date:** June 30, 2026  
**Focus:** String manipulation basics, two-pointer on strings, frequency arrays  

## The Real Talk About Today

I hate strings. I'll be honest about that.

First semester in C? Failed 3 string test cases in one exam. Trauma unlocked.

But today I didn't run from it. I faced it.

Spent 3-4 hours refreshing string syntax from scratch.
Then solved 3 string problems.
Each one felt like climbing a mountain.

But I did it. That matters.

## Problems Solved

### 1. Valid Palindrome
**LeetCode 125** - [Link](https://leetcode.com/problems/valid-palindrome/)
- Pattern: Two Pointer
- Difficulty: Easy
- **Time:** 2 hours (heavy struggle with string syntax)
- **Approach:** 
  - Built custom isAlphanumeric() function
  - Two pointers from both ends
  - Compare while ignoring spaces/special characters
- **Key struggle:** String manipulation syntax took longer than logic

### 2. Valid Anagram
**LeetCode 242** - [Link](https://leetcode.com/problems/valid-anagram/)
- Pattern: Frequency Array
- Difficulty: Easy
- **Time:** 30 minutes
- **Approach:**
  - Count frequency of each character in both strings
  - Compare frequency arrays
  - If frequencies match = anagram
- **Why XOR didn't work:** XOR cancels out, but anagrams need character COUNT, not just presence
- **Learning:** Frequency array > XOR for anagrams

### 3. First Unique Character in a String
**LeetCode 387** - [Link](https://leetcode.com/problems/first-unique-character-in-a-string/)
- Pattern: Frequency Array + Single Pass
- Difficulty: Easy
- **Time:** 30 minutes
- **Approach:**
  - First pass: count frequency of all characters
  - Second pass: find first character with frequency = 1
- **Key insight:** Two-pass solution cleaner than HashMap

## 📚 Learning: String Fundamentals from Scratch

**Time invested:** 3-4 hours

Refreshed everything:
- String methods in Java
- Character vs String difference
- Iterating through strings
- ASCII values
- Case sensitivity handling

**Why this was necessary:**
I realized I was trying to solve string problems without solid fundamentals.
Going back to basics = slower progress today, but stronger foundation.

## Evening: Harkirat's Episode 2

Watched **Harkirat's Full Stack course - Episode 2 (1 hour)**
- No implementation yet
- Orientation/theory
- Building VS Code clone planned for next Sunday

## Day 7 Reflection

## Pattern Comparison: Arrays vs Strings

| Pattern | Arrays | Strings |
|---------|--------|---------|
| Two Pointer | Easy for me | Learning |
| Frequency Counting | Easy for me | Learning |
| Syntax comfort | High | Low |
| Emotional ease | High | Very Low |

## Total Problems This Week: 22
(Week 1: 19 + Week 2 Day 7: 3)

## Next: More String Practice Needed

Day 7 taught me:
✅ Frequency arrays work for anagrams
✅ Two pointers work on strings too
✅ Custom helper functions make code cleaner
❌ I still have string anxiety
⚠️ Need more string practice to build confidence

But I'm showing up anyway. That's what matters.

---

*Building in public means showing the hard days too.*
