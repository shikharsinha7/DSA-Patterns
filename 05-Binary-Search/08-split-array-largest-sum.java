/*
Problem: Split Array Largest Sum (LeetCode 410)
Link: https://leetcode.com/problems/split-array-largest-sum/description/
Pattern: Binary Search
Approach: Binary search on the answer itself (the max subarray sum). For each candidate value, greedily check how many groups you'd need to split into without exceeding it, and find the smallest value where that's <= m groups.
Time: O(n log(sum)) | Space: O(1)
*/

class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int res = -1;

        for(int val : nums){
            high += val;
            low = Math.max(val , low);
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isValid(nums, k , mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return res;
    }
    private boolean isValid(int[] nums , int k , int max){
        int subarray = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max){
                subarray++;
                sum = nums[i];
            }
            if(subarray > k){
                return false;
            }
        }
        return true;
    }
}
