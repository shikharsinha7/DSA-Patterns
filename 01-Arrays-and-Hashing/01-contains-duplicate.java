/*
Problem: Contains Duplicate (LeetCode 217)
Link: https://leetcode.com/problems/contains-duplicate/
Pattern: Arrays and Hashing
Approach: Throw everything into a hashset while looping through the array. If a number is already in the set when you see it again, that's your duplicate.
Time: O(n) | Space: O(n)
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            if(!set.add(val)){
                return true;
            }
        }
        return false;
    }
}
