/*
Problem: Evaluate Reverse Polish Notation (LeetCode 150)
Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
Pattern: Monotonic Stack
Approach: Use a stack. Push numbers as you see them. When you hit an operator, pop the top two numbers off, apply the operator, and push the result back on.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();

                stack.push(b - a);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int a = stack.pop(); 
                int b = stack.pop(); 

                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
