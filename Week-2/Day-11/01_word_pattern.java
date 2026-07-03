// Problem: Word Pattern
// LeetCode 290: https://leetcode.com/problems/word-pattern/
// Difficulty: Easy
// Pattern: Frequency Array / HashMap (Character to Word mapping)
// Time Complexity: O(n)
// Space Complexity: O(1) for pattern, O(n) for words
// Date: July 4, 2025
//
// APPROACH:
// Map pattern characters to words
// Ensure one-to-one mapping (no duplicate mappings)
// Same frequency/mapping muscle as Valid Anagram
// Different shape - characters map to words instead of characters
//
// Example: pattern = "abba", s = "dog cat cat dog"
// a → dog, b → cat, b → cat, a → dog ✓


class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map< String , Character > map1 = new HashMap<>();
        Map< Character , String > map2 = new HashMap<>();
        String words[] = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i = 0 ; i < pattern.length() ; i ++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map1.containsKey(word)){
                if(map1.get(word) != ch){
                    return false;
                }}
                else{
                    map1.put(word,ch);
                }
            
            if(map2.containsKey(ch)){
                if(!map2.get(ch).equals(word)){
                    return false;
                }}
                else{
                    map2.put(ch,word);
                }
            
        }
        return true;
    }
}
