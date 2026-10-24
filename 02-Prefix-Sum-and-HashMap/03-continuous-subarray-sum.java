/*
Problem: Continuous Subarray Sum (LeetCode 523)
Link: https://leetcode.com/problems/continuous-subarray-sum/description/
Pattern: Prefix Sum + HashMap
Approach: Track running sum mod k. Store the first index where each remainder occurred. If the same remainder shows up again with a gap of at least 2, you've found a valid subarray.
Time: O(n) | Space: O(min(n, k))
*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> remainder = new HashMap<>();
        remainder.put(0, -1);
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
            int r = total % k;
            if(!remainder.containsKey(r)){
                remainder.put(r, i);
            }
            else if(i - remainder.get(r) > 1){
                return true;
            }
        }
        return false;
    }
}
