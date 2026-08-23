/*
Problem: Subarray Sum Equals K (LeetCode 560)
Link: https://leetcode.com/problems/subarray-sum-equals-k/description/
Pattern: Prefix Sum + HashMap
Approach: Keep a running prefix sum as you go, and store how many times each prefix sum value has occurred in a hashmap. At each step check if (currentSum - k) has occurred before — if yes, add that count to the answer.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        prefixSum.put(0 , 1);
        int curSum = 0;
        int res = 0;
        for(int num : nums){
            curSum += num;

            res += prefixSum.getOrDefault(curSum - k , 0);
            prefixSum.put(curSum , prefixSum.getOrDefault(curSum , 0) + 1);
        }
        return res;
    }
}
