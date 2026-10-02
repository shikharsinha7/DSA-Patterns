/*
Problem: Largest Rectangle in Histogram (LeetCode 84)
Link: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
Pattern: Monotonic Stack
Approach: Keep a stack of (index, height) pairs in increasing height order. When you hit a smaller height, pop off taller bars and calculate the rectangle area they could've made using the current index as the right boundary.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            int start = i;

            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] pair = stack.pop();

                int index = pair[0];
                int height = pair[1];

                maxArea = Math.max(maxArea, height * (i - index));

                start = index;
            }

            stack.push(new int[]{start, heights[i]});
        }

        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];

            maxArea = Math.max(maxArea, height * (heights.length - index));
        }

        return maxArea;
    }
}
