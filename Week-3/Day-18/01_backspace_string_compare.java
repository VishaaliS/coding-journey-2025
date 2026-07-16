// Problem: Backspace String Compare
// LeetCode 844: https://leetcode.com/problems/backspace-string-compare/
// Difficulty: Easy
// Pattern: Stack (or Two Pointer from end)
// Time Complexity: O(n+m)
// Space Complexity: O(n+m)
// Date: July 10, 2026
//
// APPROACH:
// Use stack to build final strings
// '#' = pop (backspace)
// Regular character = push
// Compare final strings


class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st1 = new Stack<>();
       Stack<Character> st2 = new Stack<>();
       for(int i = 0 ; i < s.length() ; i++){
        if(!st1.empty() && s.charAt(i) == '#'){
            st1.pop();
        }
        if(s.charAt(i) != '#'){
            st1.push(s.charAt(i));}
        }
       
       for(int i = 0 ; i < t.length() ; i++){
        if(!st2.empty() && t.charAt(i) == '#'){
            st2.pop();
        }
        if(t.charAt(i) != '#'){
            st2.push(t.charAt(i));
        }
       }
       if(st1.size() != st2.size()){return false;}
       while(!st1.empty()){
    if(st1.pop() != st2.pop()){
        return false;
    }
}
       return true;
    }
}
