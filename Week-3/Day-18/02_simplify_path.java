// Problem: Simplify Path
// LeetCode 71: https://leetcode.com/problems/simplify-path/
// Difficulty: Medium
// Pattern: Stack (Path Parsing)
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 10, 2025
//
// APPROACH:
// Split path by '/'
// '..' = pop (go up one directory)
// '.' or empty = skip
// Directory name = push
// Build result from stack with '/' separators


class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");
        for(String part : parts){
            if(part.equals("") || part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!st.empty()){
                    st.pop();
                }
            }
            else{
                st.push(part);
            }
            
         
        }
        if(st.empty()){return "/";}
        StringBuilder ans = new StringBuilder();

        for (String dir : st) {
            ans.append("/").append(dir);
        }

        return ans.toString();
    }
}
