# Day 16 - Linked List Pattern Consolidation

**Date:** July 8, 2025  
**Focus:** Linked list problem-solving with multiple pointer techniques

## Problems Solved: 5

### 1. Merge Two Sorted Lists
**LeetCode 21** - [Link](https://leetcode.com/problems/merge-two-sorted-lists/)
- Pattern: Dummy node + Two pointer
- Difficulty: Easy
- Time: 20 minutes
- Approach: Compare nodes, attach smaller, move pointer

### 2. Palindrome Linked List
**LeetCode 234** - [Link](https://leetcode.com/problems/palindrome-linked-list/)
- Pattern: Fast/Slow + Reverse
- Difficulty: Easy
- Time: 25 minutes (30-min rule applied)
- Approach: Find middle (fast/slow) → reverse second half → compare both halves

### 3. Remove Duplicates from Sorted List
**LeetCode 83** - [Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
- Pattern: Traversal + Skip nodes
- Difficulty: Easy
- Time: 12 minutes
- Approach: If curr.val == curr.next.val → skip next node

### 4. Intersection of Two Linked Lists
**LeetCode 160** - [Link](https://leetcode.com/problems/intersection-of-two-linked-lists/)
- Pattern: Two pointer (switch lists)
- Difficulty: Easy
- Time: 20 minutes
- Approach: Traverse both lists. When reach end, switch to other list's head. Meet at intersection or NULL.

### 5. Remove Nth Node From End
**LeetCode 19** - [Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
- Pattern: Two pointer with gap
- Difficulty: Medium
- Time: 18 minutes
- Approach: Move fast N steps ahead. Then move both until fast hits end. Slow is at target.

---

## Patterns Applied Today

**Fast/Slow Pointer:** Palindrome detection (find middle)  
**Two Pointer with Gap:** Remove Nth from end  
**Two Pointer (Switch):** Intersection detection  
**Dummy Node:** Merge sorted lists  
**Traversal + Skip:** Remove duplicates  

---

## Key Techniques Learned

### Dummy Node Pattern
Creating a dummy node simplifies edge cases (empty lists, single node).

### Fast/Slow Combination
Used for finding middle, then reversing second half for palindrome check.

### Two Pointer Gap Technique
Maintain fixed distance between pointers to find Nth from end in one pass.

### Switch Lists Trick
For intersection: when pointer reaches end, switch to other list. Equalizes path length.

---

## Stats

| Metric | Count |
|--------|-------|
| Problems solved | 5 |
| Total problems | ~49 |
| Total time | ~95 minutes |
| Day | 16/180 |
| Week | 3 |

---

## Reflection

Yesterday: Learned linked list fundamentals  
Today: Applied them to 5 different problems

Foundation work (Day 15) paid off. Pattern recognition getting faster.

---

**Day 16/180 ✅**
