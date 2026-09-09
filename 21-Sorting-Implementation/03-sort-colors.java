/*
Problem: Sort Colors (LeetCode 75)
Link: https://leetcode.com/problems/sort-colors/
Pattern: Sorting (Implementation Level)
Approach: Dutch National Flag algorithm — three pointers (low, mid, high) that partition the array into 0s, 1s, and 2s in a single pass without needing a second array.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;

        while(i <= r){
            if(nums[i] == 0){
                swap(nums, l, i);
                l++;
            }else if(nums[i] == 2){
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
