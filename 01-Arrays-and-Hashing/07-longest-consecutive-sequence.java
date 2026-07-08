/*
Problem: Longest Consecutive Sequence (LeetCode 128)
Link: https://leetcode.com/problems/longest-consecutive-sequence/description/
Pattern: Arrays and Hashing
Approach: Drop all numbers into a hashset. For each number, only start counting a sequence if (num - 1) is NOT in the set — that means it's the start of a sequence — then keep counting forward.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for(int val : nums){
            set.add(val);
        }
        for(int val : set){
            if(!set.contains(val - 1)){
                int length = 0;
                while(set.contains(val + length)){
                    length++;
                }
                maxLen = Math.max(maxLen , length);
            }
        }
        return maxLen;
    }
}
