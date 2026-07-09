# Day 17 - Stack Fundamentals & Applications

**Date:** July 9, 2025  
**Focus:** Stack data structure - implementation and problem-solving

## What I Learned

### Stack Basics

**Concept:** LIFO (Last In, First Out)

**Implementation with Arrays:**
- Created my own push() function
- Created my own pop() function
- Tracked top pointer
- Handled overflow/underflow

**Java Built-in Stack:**
- `Stack<Type> stack = new Stack<>();`
- `stack.push(element)` - add to top
- `stack.pop()` - remove from top
- `stack.peek()` - view top without removing
- `stack.isEmpty()` - check if empty

---

## Problems Solved: 3

### 1. Valid Parentheses
**LeetCode 20** - [Link](https://leetcode.com/problems/valid-parentheses/)
- Pattern: Stack (matching pairs)
- Difficulty: Easy
- Time: 15 minutes
- Approach: Push opening brackets. Pop and match closing brackets.

### 2. Remove All Adjacent Duplicates in String
**LeetCode 1047** - [Link](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
- Pattern: Stack (character matching)
- Difficulty: Easy
- Time: 12 minutes
- Approach: Push character. If top matches current → pop instead of pushing.

### 3. Baseball Game
**LeetCode 682** - [Link](https://leetcode.com/problems/baseball-game/)
- Pattern: Stack (operations)
- Difficulty: Easy
- Time: 15 minutes
- Approach: Stack operations based on string input (number, "+", "D", "C").

---

## New Data Structure Unlocked: Stack ✅

**Use cases:**
- Matching brackets/parentheses
- Undo/redo functionality
- Expression evaluation
- Backtracking problems
- Adjacent element removal

---

## Stats

| Metric | Count |
|--------|-------|
| Problems solved | 3 |
| Total problems | ~52 |
| Total time | ~42 minutes |
| New data structure | Stack |
| Day | 17/180 |
| Week | 3 |

---

## Reflection

Same pattern as Day 15 (Linked List):
- Learn fundamentals first (implement from scratch)
- Understand built-in tools (Java Stack class)
- Apply to problems immediately

Foundation days lead to faster problem-solving.

---

**Day 17/180 ✅**
