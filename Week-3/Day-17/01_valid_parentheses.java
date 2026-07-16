// Problem: Valid Parentheses
// LeetCode 20: https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Pattern: Stack (Matching Pairs)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 9, 2026
//
// APPROACH:
// Push opening brackets to stack
// For closing brackets:
//   - Check if stack is empty (invalid)
//   - Pop and check if it matches
// After iteration, stack should be empty

class Solution {
    int top = -1;
    char[] arr = new char[10000];
    public void push(char c ){
       top = top+1;
       arr[top] = c;
    }
    public void pop(){
        top = top-1;
        
    }
    
    public boolean isValid(String s) {
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                push(s.charAt(i));
            }
            if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) ==…();
                    
                }
                
                else if(arr[top] == '{' && s.charAt(i) == '}'){
                    pop();
                    
                }
               
                else if(arr[top] == '[' && s.charAt(i) == ']'){
                    pop();
                    
                }
                else{return false;}
                
            }
        }
        if(top != -1){
            return false;
        }
        return true;
    }
}
