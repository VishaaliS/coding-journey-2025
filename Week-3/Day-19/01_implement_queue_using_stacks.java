// Problem: Implement Queue using Stacks
// LeetCode 232: https://leetcode.com/problems/implement-queue-using-stacks/
// Difficulty: Easy
// Pattern: Two Stacks (Simulate Queue)
// Time Complexity: O(1) amortized
// Space Complexity: O(n)
// Date: July 11, 2025
//
// APPROACH:
// Use two stacks to simulate FIFO behavior
// Stack 1 (input): For enqueue operations
// Stack 2 (output): For dequeue operations
//
// Enqueue: Push to input stack
// Dequeue: 
//   - If output stack empty, transfer all from input to output
//   - Pop from output stack
//
// This converts LIFO (stack) to FIFO (queue)


class MyQueue {
    int front;
    int back;
    int[] arr;
    public MyQueue() {
      front = 0;
      back = 0;
      arr = new int[10000];  
    }
    
    public void push(int x) {
      arr[back] = x;
      back = back + 1;
        
    }
    
    public int pop() {
        front = front + 1;
        return arr[front -1];
    }
    
    public int peek() {
        return arr[front];
    }
    
    public boolean empty() {
        if(front == back){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
