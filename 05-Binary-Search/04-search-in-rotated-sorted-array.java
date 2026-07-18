/*
Problem: Search in Rotated Sorted Array (LeetCode 33)
Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
Pattern: Binary Search
Approach: Still binary search, but at each step you first figure out which half (left or right of mid) is actually sorted, then decide which half the target could be in based on that.
Time: O(log n) | Space: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int n = nums.length;
        int ans = -1;
        if(nums[0] <= nums[n-1]){
            ans = 0;
        }else{
            while(low <= high){
                int mid = low + (high - low) / 2;
                int prev = (mid + n - 1) % n;
                int next = (mid + 1) % n;
                if(nums[mid] < nums[next] && nums[mid] < nums[prev]){
                    ans = mid;
                    break;
                }
                if(nums[mid] >= nums[low]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        int li = binarySearch(nums, 0, ans-1, target);
        int ri = binarySearch(nums, ans, nums.length - 1, target);
        return li == -1 ? ri : li;
    }
    private int binarySearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
