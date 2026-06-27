# Day 4 - The Hardest Day Yet (Prefix Sum Deep Dive)

**Date:** June 26, 2025  
**Focus:** Subarray Sum problems (struggled hard but broke through!)  

## 🔥 What Actually Happened Today

**This was the toughest day of the week.**

Woke up and jumped straight into **Subarray Sum Equals K** (LeetCode 560).  
Big mistake. This problem **drained me.**

Watched the solution video 4-5 times. Still couldn't get it.  
Something was missing from my foundation.

Then I realized: **I was trying to run before I could walk.**

## The Breakthrough Moment 💡

I searched for similar concepts and found:  
**"Find the subarray with the largest sum"**

That's when it clicked - I needed to understand **finding subarray sums**  
BEFORE I could find subarrays that equal a specific value.

**This wasn't even on LeetCode** - just a fundamental concept.  
But it was the missing piece.

Once I learned that foundation first, then came back to Subarray Sum Equals K,  
everything made sense.

**Time spent on just this one problem: Most of my day.**

But I didn't give up. I went back, filled the gap, then conquered it.

## Problems Solved

### 1. 🧠 Subarray Sum Equals K - The Beast
**LeetCode 560** - [Link](https://leetcode.com/problems/subarray-sum-equals-k/)
- Pattern: Prefix Sum + HashMap
- Difficulty: Medium (felt like Hard today!)
- **Reality check:** Took hours, not minutes
- **What I learned:** Sometimes you need to learn the prerequisites first

**The key insight I was missing:**

You can't find "subarrays that equal K" if you don't understand "how to find subarray sums" first!

Prefix Sum concept: currentSum - previousSum = sum of subarray in between

So if: currentSum - K = some previousSum we've seen, then there exists a subarray that sums to K!

### 2. ✅ Max Consecutive Ones - Easy Relief
**LeetCode 485** - [Link](https://leetcode.com/problems/max-consecutive-ones/)
- Pattern: Simple counter
- Difficulty: Easy
- **Time to solve:** Fast! Needed this win after the struggle
- Just count 1s, reset on 0, track maximum

### 3. ✅ Merge Strings Alternately - Pattern Recognition!
**LeetCode 1768** - [Link](https://leetcode.com/problems/merge-strings-alternately/)
- Pattern: Two Pointers
- Difficulty: Easy
- **Why it was easy:** Very similar to "Merge Two Lists" pattern I already know
- Two pointers, alternate, handle remaining characters

## What I Learned (The Hard Way)

**1. It's okay to struggle**  
Real learning happens when you're uncomfortable.

**2. Know when to step back**  
If you've watched a solution 4-5 times and still don't get it, you're missing a prerequisite. Go find it.

**3. Fill the gaps**  
I could have skipped the "largest subarray sum" concept and just memorized the solution. But I stopped and learned the foundation. That's the difference between cramming and actually learning.

**4. Pattern recognition pays off**  
After doing "Merge Two Lists", "Merge Strings Alternately" took almost no time. Patterns compound!

## Prefix Sum - Finally Understood

**What it is:** Running total at each position.

Array: [1, 2, 3, 4]  
Prefix Sum: [1, 3, 6, 10]

**Why it matters:** To find sum of ANY subarray in O(1):

Sum from index i to j = prefixSum[j] - prefixSum[i-1]

Example: Sum from index 1 to 3 = prefixSum[3] - prefixSum[0] = 10 - 1 = 9 = (2 + 3 + 4) ✓

**How it helps with "Sum Equals K":** Use HashMap to store prefix sums. If currentSum - K exists in HashMap = found subarray!

## Honest Stats

- **Time on Subarray Sum Equals K:** ~6 hours (including learning prerequisites)
- **Time on Max Consecutive Ones:** ~15 minutes
- **Time on Merge Strings Alternately:** ~20 minutes
- **Lessons learned:** Priceless


## Total Problems Solved: 15


*Building in public means showing the struggles too.*
