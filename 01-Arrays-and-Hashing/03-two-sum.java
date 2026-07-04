/*
Problem: Two Sum (LeetCode 1)
Link: https://leetcode.com/problems/two-sum/
Pattern: Arrays and Hashing
Approach: Walk through the array once, and for each number check if (target - number) is already sitting in your hashmap. If yes you found your pair, if no add current number to the map and move on.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i , map.get(complement)};
            }
            map.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}
