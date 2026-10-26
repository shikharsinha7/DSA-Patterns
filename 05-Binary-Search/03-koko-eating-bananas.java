/*
Problem: Koko Eating Bananas (LeetCode 875)
Link: https://leetcode.com/problems/koko-eating-bananas/description/
Pattern: Binary Search
Approach: Binary search on the eating speed itself (from 1 up to the biggest pile). For each candidate speed, check if she can finish all piles within h hours, and find the smallest speed where that's true.
Time: O(n log m), m = max pile size | Space: O(1)
*/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        int res = right;
        while(left <= right){
            int k = left + (right - left) / 2;
            long hours = 0;
            for(int pile : piles){
                hours += (pile + k - 1) / k;
            }
            if(hours <= h){
                res = Math.min(res, k);
                right = k - 1;
            }else{
                left = k + 1;
            }
        }   
        return res;
    }
}
