# Day 18 - Stack Mastery Through Practice

**Date:** July 10, 2025  
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

## Problems Solved: 5

### 1. Backspace String Compare
**LeetCode 844** - [Link](https://leetcode.com/problems/backspace-string-compare/)
- Pattern: Stack (or two pointer from end)
- Difficulty: Easy
- Time: 15 minutes
- Approach: '#' = pop (backspace). Build final strings and compare.

### 2. Simplify Path
**LeetCode 71** - [Link](https://leetcode.com/problems/simplify-path/)
- Pattern: Stack (path parsing)
- Difficulty: Medium
- Time: 20 minutes
- Approach: Split by '/'. '..' = pop, '.' = skip, directory name = push.

### 3. Evaluate Reverse Polish Notation
**LeetCode 150** - [Link](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
- Pattern: Stack (expression evaluation)
- Difficulty: Medium
- Time: 18 minutes
- Approach: Number = push. Operator = pop 2, calculate, push result.

### 4. Next Greater Element I
**LeetCode 496** - [Link](https://leetcode.com/problems/next-greater-element-i/)
- Pattern: Stack (monotonic stack)
- Difficulty: Easy
- Time: 25 minutes
- Approach: Stack stores indices. Pop when current > stack top. Map next greater elements.

### 5. Baseball Game
**LeetCode 682** - [Link](https://leetcode.com/problems/baseball-game/)
- Pattern: Stack (operations)
- Difficulty: Easy
- Time: 15 minutes
- Approach: Stack operations based on string input (number, "+", "D", "C").

---

## New Data Structure Unlocked: Stack ✅

**Stack applications seen today:**
- ✅ Matching/comparing strings (backspace)
- ✅ Path parsing (file systems)
- ✅ Expression evaluation (RPN)
- ✅ Next greater element (monotonic stack)
- ✅ Custom operations (baseball game)

**Key insight:** Stack is versatile - works for matching, evaluation, parsing, and tracking.

---

## Stats

| Metric | Count |
|--------|-------|
| Problems solved | 5 |
| Total problems | ~54 |
| Total time | ~93 minutes |
| New data structure | Stack |
| Day | 18/180 |
| Week | 3 |

---

## Reflection

Same pattern as Day 15 (Linked List) and Day 16:
- Learn fundamentals first (implement from scratch)
- Understand built-in tools (Java Stack class)
- Apply to 5 different problem types immediately

Foundation days + volume practice = pattern mastery.

---

**Day 18/180 ✅**
