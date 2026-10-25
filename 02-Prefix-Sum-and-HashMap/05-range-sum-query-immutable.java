/*
Problem: Range Sum Query Immutable (LeetCode 303)
Link: https://leetcode.com/problems/range-sum-query-immutable/description/
Pattern: Prefix Sum + HashMap
Approach: Precompute one prefix sum array up front. After that every range sum query is just subtracting two prefix sum values, done in O(1).
Time: O(n) build, O(1) per query | Space: O(n)
*/

class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        int cur = 0;
        for(int i = 0; i < nums.length; i++){
            cur += nums[i];
            prefix[i] = cur;
        }
    }
    
    public int sumRange(int left, int right) {
        int rightSum = prefix[right];
        int leftSum = (left > 0) ? prefix[left - 1] : 0;
        return rightSum - leftSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
