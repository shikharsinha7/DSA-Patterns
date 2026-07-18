/*
Problem: Find Minimum in Rotated Sorted Array (LeetCode 153)
Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
Pattern: Binary Search
Approach: Binary search comparing mid to right. If mid's value is greater than right's, the minimum has to be somewhere in the right half, otherwise it's in the left half (including mid).
Time: O(log n) | Space: O(1)
*/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int low = 0;
        int high = n - 1;
        while(low <= high){
            if(nums[low] < nums[high]) return nums[low];
            int mid = low + (high - low) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;
            if(nums[mid] <= nums[next] && nums[mid] <= nums[prev]){
                return nums[mid];
            }
            if(nums[mid] <= nums[high]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
