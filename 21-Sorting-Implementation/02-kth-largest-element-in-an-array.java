/*
Problem: Kth Largest Element in an Array (LeetCode 215)
Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
Pattern: Sorting (Implementation Level)
Approach: Quickselect — basically quicksort's partitioning step, but you only ever recurse into the side of the partition that actually contains the kth element, skipping the other side entirely.
Time: O(n) average, O(n^2) worst case | Space: O(1) in-place
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, k);
    }
    private int quickSelect(int[] nums, int l, int r, int k){
        
        int pivotIndex = l + (int)(Math.random() * (r - l + 1));
        int pivot = nums[pivotIndex];

        int low = l;
        int i = l;
        int high = r;

        while(i <= high){
            if(nums[i] < pivot){
                int temp = nums[low];
                nums[low] = nums[i];
                nums[i] = temp;
                low++;
                i++;
            }else if(nums[i] > pivot){
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
            }else{
                i++;
            }
        }
        
        if(k < low){
            return quickSelect(nums, l, low - 1, k);
        }
        else if(k > high){
            return quickSelect(nums, high + 1, r, k);
        }
        else{
            return nums[k];
        }
    }
}
