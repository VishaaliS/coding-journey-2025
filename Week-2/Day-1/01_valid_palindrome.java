// Problem: Valid Palindrome
// LeetCode 125: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// Pattern: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 30, 2025
//
// APPROACH:
// Two pointers from both ends
// Skip non-alphanumeric characters
// Compare characters (case-insensitive)
// Custom isAlphanumeric() function built

class Solution {
    public static Boolean isalp(char c){
        if(((int)c >= 65 && (int)c <= 90)||((int)c >= 97 && (int)c <= 122)||((int)c >= 48 && (int)c <= 57)){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean isPalindrome(String s) {
      int i = 0 ;
       int j = s.length() -1 ;
       while(i<=j){
        if(isalp(s.charAt(i)) && isalp(s.charAt(j))){
           if (Character.toLowerCase(s.charAt(i)) ==
    Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else{return false;}
        }
        else if(!isalp(s.charAt(i))){i++;}
        else if(!isalp(s.charAt(j))){j--;}
       }  
       return true;
    }
    }
 
