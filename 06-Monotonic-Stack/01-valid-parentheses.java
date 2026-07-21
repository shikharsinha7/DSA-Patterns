/*
Problem: Valid Parentheses (LeetCode 20)
Link: https://leetcode.com/problems/valid-parentheses/description/
Pattern: Monotonic Stack
Approach: Use a stack. Push opening brackets onto it. When you see a closing bracket, check if it matches the bracket on top of the stack — if yes pop it, if no the string is invalid.
Time: O(n) | Space: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    return false;
                }
            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    return false;
                }
            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    return false;
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean handleClosing(Stack<Character> st, char corresch) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corresch) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }
}
