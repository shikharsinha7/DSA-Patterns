/*
Problem: Majority Element - Boyer-Moore Voting (LeetCode 169)
Link: https://leetcode.com/problems/majority-element/description/
Pattern: Array Simulation / In-place Logic
Approach: No hashmap counting needed. Maintain a candidate and a counter. If counter hits 0, pick the current element as the new candidate. Increment counter if the current element matches the candidate, decrement otherwise. The surviving candidate at the end is guaranteed to be the majority element (only works because a majority element is guaranteed to exist by problem constraints).
Time: O(n) | Space: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;
        for(int n : nums){
            if(count == 0){
                res = n;
            }
            count += n == res ? 1 : -1;
        }
        return res;
    }
}
