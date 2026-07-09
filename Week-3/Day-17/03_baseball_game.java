// Problem: Baseball Game
// LeetCode 682: https://leetcode.com/problems/baseball-game/
// Difficulty: Easy
// Pattern: Stack (Operations)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 9, 2025
//
// APPROACH:
// Process each operation:
// - Number: push to stack
// - "+": push sum of top 2
// - "D": push double of top
// - "C": pop (invalidate last score)
// Sum all elements in stack

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < operations.length ; i ++){
            if(operations[i].equals("+")){
                int first = st.pop();
                int second  = st.peek();
                st.push(first);
                st.push(first + second);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int top = st.peek();
                st.push(top * 2);
            }
            else{
                int num = Integer.valueOf(operations[i]);
                st.push(num);
            }
        }
        int sum = 0;
        for(int n : st){
            sum = sum + n;
        }
        return sum;
    }
}
