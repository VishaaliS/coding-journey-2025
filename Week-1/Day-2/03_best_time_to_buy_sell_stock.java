// Problem: Best Time to Buy and Sell Stock
// LeetCode 121: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Pattern: Single Pass, Track Minimum
// Time Complexity: O(n)
// Space Complexity: O(1)
// Date: June 24, 2026

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
      
        for(int i = 0 ; i < prices.length ; i ++){
            if(prices[i] < min){
                min = prices[i];
               }
                if(prices[i] - min > max){
                    max = prices[i] - min;
                }
            
        }
            
            return max;
        }
    }

