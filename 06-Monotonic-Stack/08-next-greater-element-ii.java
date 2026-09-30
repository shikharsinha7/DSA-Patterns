/*
Problem: Next Greater Element II (LeetCode 503)
Link: https://leetcode.com/problems/next-greater-element-ii/description/
Pattern: Monotonic Stack
Approach: Same monotonic decreasing stack idea as Daily Temperatures, but loop through the array twice to simulate it being circular.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }
            if (i < n && !stack.isEmpty()) {
                ans[i] = stack.peek();
            }
            stack.push(curr);
        }
        return ans;
    }
}
