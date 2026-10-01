/*
Problem: Generate Parentheses (LeetCode 22)
Link: https://leetcode.com/problems/generate-parentheses/description/
Pattern: Monotonic Stack
Approach: Backtracking/DFS while keeping count of how many open and close brackets you've used. Only add a close bracket if closeCount < openCount, and only add open if openCount < n.
Time: O(4^n / sqrt(n)) (Catalan number bound) | Space: O(n) recursion depth
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();

        backtrack(0, 0, n, stack, res);

        return res;
    }

    private void backtrack(int openN, int closedN, int n,
                           StringBuilder stack, List<String> res) {

        if (openN == n && closedN == n) {
            res.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append('(');
            backtrack(openN + 1, closedN, n, stack, res);
            stack.deleteCharAt(stack.length() - 1);
        }

        if (closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN + 1, n, stack, res);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
