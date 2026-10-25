/*
Problem: Subarray Sums Divisible by K (LeetCode 974)
Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
Pattern: Prefix Sum + HashMap
Approach: Basically the same idea as Subarray Sum Equals K, but instead of exact sums you're tracking prefix sum mod k in the hashmap with counts.
Time: O(n) | Space: O(k)
*/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        int res = 0;
        int[] prefixCnt = new int[k];
        prefixCnt[0] = 1;
        for(int num : nums){
            prefixSum += num;
            int remainder = prefixSum % k;
            if(remainder < 0){
                remainder += k;
            }
            res += prefixCnt[remainder];
            prefixCnt[remainder]++;
        }
        return res;
    }
}
