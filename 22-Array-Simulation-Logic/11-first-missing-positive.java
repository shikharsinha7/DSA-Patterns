/*
Problem: First Missing Positive (LeetCode 41)
Link: https://leetcode.com/problems/first-missing-positive/description/
Pattern: Array Simulation / In-place Logic
Approach: The array-as-hashmap trick again - for every value v in range [1, n], swap it to its "correct" position at index v-1. After one cleanup pass of swaps, scan the array: the first index i where arr[i] != i+1 gives you the answer (i+1). If everything matches, the answer is n+1.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]);
            if(1 <= val && val <= nums.length){
                if(nums[val - 1] > 0){
                    nums[val - 1] *= -1;;
                }else if(nums[val - 1] == 0){
                    nums[val - 1] = -1 * (nums.length + 1);
                }
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if(nums[i - 1] >= 0){
                return i;
            }
        }
        return nums.length + 1;
    }
}
