// Problem: Design Circular Deque
// LeetCode 641: https://leetcode.com/problems/design-circular-deque/
// Difficulty: Medium
// Pattern: Circular Deque (Double-Ended Queue)
// Time Complexity: O(1) for all operations
// Space Complexity: O(k)
// Date: July 16, 2026
// APPROACH:
// Similar to circular queue
// Add operations at both front and back
// Use modulo for wrap-around in both directions
//
// insertFront: Decrement front (with modulo), add element
// insertLast: Add element, increment rear (with modulo)
// deleteFront: Increment front
// deleteLast: Decrement rear
//
// 30-min rule applied - harder than circular queue

class MyCircularDeque {

    int[] q;
    int front;
    int rear;
    int size;

    public MyCircularDeque(int k) {
        q = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {

        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
            q[front] = value;
            size++;
            return true;
        }

        front = (front - 1 + q.length) % q.length;
        q[front] = value;
        size++;

        return true;
    }

    public boolean insertLast(int value) {


