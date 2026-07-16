// Problem: Evaluate Reverse Polish Notation
// LeetCode 150: https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Difficulty: Medium
// Pattern: Stack (Expression Evaluation)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 10, 2026
//
// APPROACH:
// Iterate through tokens
// Number → push to stack
// Operator → pop 2 operands, calculate, push result
// Final stack top = answer


class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int first = st.pop();
                int second = st.pop();
                st.push(first + second);
            }
            else if(s.equals("-")){
                int first = st.pop();
                int second = st.pop();
                st.push(second - first);
            }
            else if(s.equals("*")){
                int first = st.pop();
                int second = st.pop();
                st.push(first * second);
            }
            else if(s.equals("/")){
                int first = st.pop();
                int second = st.pop();
                st.push(second / first);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
        
    }
}
