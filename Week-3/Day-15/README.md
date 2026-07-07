# Day 15 - Linked List Foundations & Fast/Slow Pointer Pattern

**Date:** July 7, 2025  
**Focus:** Linked list fundamentals + fast/slow pointer technique

## Today's Approach: Learn, Then Apply

Morning: Learned linked list fundamentals  
Afternoon: Applied the knowledge - solved 3 problems

## What I Learned

### Linked List Basics (Refreshed from C)

**Node creation:**
- Structure with data + pointer to next node
- Memory allocation (dynamic)

**Insertion:**
- At beginning (update head pointer)
- At end (traverse to tail, link new node)
- At specific position (traverse, adjust pointers)

**Traversal:**
- Start at head
- Follow next pointers until NULL

**Types:**
- Single linked list (next pointer only)
- Doubly linked list (next + prev pointers)
- Circular linked list (tail points to head)

### Real-Life Applications

- Browser history (back/forward navigation)
- Music playlists (next/previous song)
- Undo/redo functionality
- Memory management (free blocks)

---

## Problems Solved: 3

### 1. Reverse Linked List
**LeetCode 206** - [Link](https://leetcode.com/problems/reverse-linked-list/)
- Pattern: Pointer manipulation
- Difficulty: Easy
- Time: ~20 minutes
- Approach: Three pointers (prev, current, next), reverse links iteratively

### 2. Middle of the Linked List
**LeetCode 876** - [Link](https://leetcode.com/problems/middle-of-the-linked-list/)
- Pattern: Fast/Slow Pointer (Tortoise and Hare)
- Difficulty: Easy
- Time: 10 minutes
- Approach: Fast pointer (2 steps), slow pointer (1 step). When fast reaches end, slow is at middle.

### 3. Linked List Cycle
**LeetCode 141** - [Link](https://leetcode.com/problems/linked-list-cycle/)
- Pattern: Fast/Slow Pointer (Floyd's Cycle Detection)
- Difficulty: Easy
- Time: 12 minutes
- Approach: Fast/slow pointers. If they meet → cycle exists.

---

## New Pattern Unlocked: Fast/Slow Pointer ✅

**Also called:** Tortoise and Hare algorithm

**How it works:**
- Two pointers traverse at different speeds
- Fast: 2 steps per iteration
- Slow: 1 step per iteration

**Use cases:**
- Finding middle of linked list
- Detecting cycles
- Finding cycle start point
- Checking palindrome linked list

**Why it works:**
- If there's a cycle, fast pointer eventually catches slow pointer
- If no cycle, fast pointer reaches end
- For middle: when fast reaches end, slow is at middle

---

## Pattern Toolkit Update

- ✅ Two Pointer
- ✅ Frequency Array
- ✅ XOR
- ✅ HashMap
- ✅ Sliding Window
- ✅ **Fast/Slow Pointer** (NEW!)

---

## Stats

| Metric | Count |
|--------|-------|
| Problems solved | 3 |
| Total problems | ~44 |
| New pattern learned | Fast/Slow Pointer |
| Time invested | ~42 mins (problems) + 3-4 hours (learning) |
| Day | 15/180 |
| Week | 3 |

---

## Why Today Worked

**Learn fundamentals first → Apply immediately**

Result:
- Reverse Linked List: 20 mins (foundation problem)
- Middle of Linked List: 10 mins (pattern applied)
- Linked List Cycle: 12 mins (pattern mastered)

Speed improved because foundation was solid.

---

**Day 15/180 ✅**

*Foundation days lead to speed days.*
