/*
Problem: Next Permutation (LeetCode 31)
Link: https://leetcode.com/problems/next-permutation/description/
Pattern: Array Simulation / In-place Logic
Approach: Pure index logic, no data structure helps here. Scan from the right to find the first index i where arr[i] < arr[i+1] (the "break point"). If none exists, the array is the last permutation - reverse it entirely. Otherwise, scan from the right again to find the smallest element greater than arr[i], swap them, then reverse everything after index i to get the smallest possible suffix.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]){
            i--;
        }
        if(i >= 0){
            int j = n - 1;
            while(nums[j] <= nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int left = i + 1;
        int right = n - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
