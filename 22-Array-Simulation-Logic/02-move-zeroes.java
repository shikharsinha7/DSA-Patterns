/*
Problem: Move Zeroes (LeetCode 283)
Link: https://leetcode.com/problems/move-zeroes/description/
Pattern: Array Simulation / In-place Logic
Approach: Maintain an "insert position" pointer. Walk through the array, and every time you see a non-zero element, swap it into the insert position and advance the pointer. By the end, all non-zero elements are shifted left in original relative order, and zeroes are naturally pushed to the back.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;
                nonZero++;
            }
        }
    }
}
