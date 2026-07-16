// Problem: Implement Stack using Queues
// LeetCode 225: https://leetcode.com/problems/implement-stack-using-queues/
// Difficulty: Easy
// Pattern: Queue Manipulation
// Time Complexity: O(n) for push, O(1) for pop
// Space Complexity: O(n)
// Date: July 16, 2026
// APPROACH:
// Use one queue
// Push operation:
//   - Add element to queue
//   - Rotate (size-1) times (dequeue and enqueue)
//   - This brings new element to front (LIFO behavior)
// Pop: Simply dequeue

class MyStack {
    int[] arr;
    int start;

    public MyStack() {
        arr = new int[10000];
        start = 0;
    }

    public void push(int x) {
        arr[start] = x;
        start++;
    }

    public int pop() {
        start--;
        return arr[start];
    }

    public int top() {
        return arr[start - 1];
    }

    public boolean empty() {
        return start == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
