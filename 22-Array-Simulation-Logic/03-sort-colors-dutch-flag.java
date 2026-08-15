/*
Problem: Sort Colors / Dutch National Flag (LeetCode 75)
Link: https://leetcode.com/problems/sort-colors/description/
Pattern: Array Simulation / In-place Logic
Approach: Three pointers - low, mid, high. Walk mid through the array: if arr[mid] is 0, swap with low and advance both low and mid; if 2, swap with high and shrink high (don't advance mid, since the swapped-in value needs checking); if 1, just advance mid. One pass, three-way partition, no extra space.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i = 0;

        while (i <= r) {
            if (nums[i] == 0) {
                swap(nums, l, i);
                l++;
            } else if (nums[i] == 2) {
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
