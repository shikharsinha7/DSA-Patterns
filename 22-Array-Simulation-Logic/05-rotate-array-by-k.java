/*
Problem: Rotate Array by K Steps, In-place (LeetCode 189)
Link: https://leetcode.com/problems/rotate-array/description/
Pattern: Array Simulation / In-place Logic
Approach: The reversal trick - reverse the entire array, then reverse the first k elements, then reverse the remaining n-k elements. Three reversals combine to produce the rotated array without any extra space. Remember to take k modulo n first in case k > n.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums , 0 , nums.length-k-1);
        reverse(nums , nums.length-k , nums.length-1);
        reverse(nums , 0 , nums.length-1);
    }
    public static void reverse(int[] arr, int li, int ri){
        while(li<ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
}
