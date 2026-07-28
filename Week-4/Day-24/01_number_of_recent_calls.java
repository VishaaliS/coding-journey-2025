// Problem: Number of Recent Calls
// LeetCode 933: https://leetcode.com/problems/number-of-recent-calls/
// Difficulty: Easy
// Pattern: Queue (Time-Based)
// Time Complexity: O(1) per operation
// Space Complexity: O(n)
// Date: July 16, 2026
// APPROACH:
// Queue stores timestamps
// For each ping(t):
//   - Add t to queue
//   - Remove all elements < (t - 3000)
//   - Return queue size (recent calls in last 3000ms)


class RecentCounter {
 Queue<Integer> ans;
    public RecentCounter() {
        int request = 0;
        ans = new LinkedList<>();
    }
    
    public int ping(int t) {
        int x = t - 3000;
        ans.offer(t);
        while(ans.peek() < x){ans.poll();}
        return ans.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
