/*
Problem: Best Time to Buy and Sell Stock (LeetCode 121)
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
Pattern: Sliding Window
Approach: Track the minimum price seen so far as you scan left to right. At every price, check what profit you'd make selling today, and keep the best one.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            }else{
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
