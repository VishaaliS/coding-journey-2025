// Problem: Next Greater Element I
// LeetCode 496: https://leetcode.com/problems/next-greater-element-i/
// Difficulty: Easy
// Pattern: Monotonic Stack
// Time Complexity: O(n)
// Space Complexity: O(n)
// Date: July 10, 2026
//
// APPROACH:
// Stack stores indices/values
// For each element, pop stack while current > stack top
// Popped elements have current as next greater
// Map next greater elements
// Query for result


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = nums2.length - 1 ; i >= 0 ; i --){
            while(!st.empty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.empty()){
                map.put(nums2[i] , -1);
            }
            else{
                map.put(nums2[i] , st.peek());
            }
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int j = 0 ; j < nums1.length ; j++){
            ans[j] = map.get(nums1[j]);
        }
        return ans;
    }
}
