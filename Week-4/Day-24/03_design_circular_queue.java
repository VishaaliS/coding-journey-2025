// Problem: Design Circular Queue
// LeetCode 622: https://leetcode.com/problems/design-circular-queue/
// Difficulty: Medium
// Pattern: Circular Queue with Array
// Time Complexity: O(1) for all operations
// Space Complexity: O(k)
// Date: July 16, 2026
// APPROACH:
// Array + front and rear pointers
// Use modulo to handle wrap-around
// Track size or use empty/full flags
// 
// Operations:
// enQueue: Add at rear, increment rear with modulo
// deQueue: Remove from front, increment front with modulo
// isEmpty: front == rear and size == 0
// isFull: (rear + 1) % capacity == front


class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int size;
    int c;
   
    public MyCircularQueue(int k) {
        queue = new int[k];
        c = k;
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size ++; 
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % queue.
