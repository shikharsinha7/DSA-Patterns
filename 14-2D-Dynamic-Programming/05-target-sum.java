/*
Problem: Target Sum (LeetCode 494)
Link: https://leetcode.com/problems/target-sum/description/
Pattern: 2D Dynamic Programming
Approach: Convert the +/- sign assignment problem into a subset sum problem, then count subsets that hit the right target using a dp array, same flavor as Partition Equal Subset Sum.
Time: O(n * sum) | Space: O(sum)
*/

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(Math.abs(target) > sum){
            return 0;
        }
        if((sum + target) % 2 != 0){
            return 0;
        }
        int s1 = (target + sum) / 2;
        return subsetSum(nums, s1);
    }
    private int subsetSum(int[] nums, int sum){
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(nums[i - 1] <= j){
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
