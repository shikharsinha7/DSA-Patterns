/*
Problem: Product of Array Except Self (LeetCode 238)
Link: https://leetcode.com/problems/product-of-array-except-self/description/
Pattern: Arrays and Hashing
Approach: Do two passes — one left to right building a prefix product, one right to left building a suffix product. Multiply prefix and suffix at each index to skip that index's own value.
Time: O(n) | Space: O(1) extra (not counting the output array)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] *= postfix;
            postfix *= nums[i];
        }
        return ans;
    }
}
