/*
Problem: Rearrange Array Elements by Sign (LeetCode 2149)
Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
Pattern: Array Simulation / Two Pointers
Approach:
Use two pointers, i and j, to track the next available even and odd
indices in the result array.
- Positive numbers are placed at even indices: 0, 2, 4, ...
- Negative numbers are placed at odd indices: 1, 3, 5, ...
Traverse the input array once. For every positive number, place it at
res[i] and move i by 2. For every negative number, place it at res[j]
and move j by 2.
This preserves the relative order of positive numbers and negative numbers.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i = 0;
        int j = 1;

        int[] res = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                res[i] = nums[k];
                i += 2;
            } else {
                res[j] = nums[k];
                j += 2;
            }
        }

        return res;
    }
}