/*
Problem: Reverse Integer, With Overflow Handling (LeetCode 7)
Link: https://leetcode.com/problems/reverse-integer/
Pattern: Simulation / Step-by-Step State Logic
Approach: Pop digits off the end using modulo and division, push them onto a running result using multiply and add - but check for overflow BEFORE each multiply/add step (comparing against Integer.MAX_VALUE / 10 boundaries) since the overflow itself would corrupt the value if checked after.
Time: O(log n) | Space: O(1)
*/

class Solution {
    public int reverse(int x) {
        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;

        int res = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (res > MAX / 10 || res == MAX / 10 && digit > MAX % 10) {
                return 0;
            }
            if (res < MIN / 10 || res == MIN / 10 && digit < MIN % 10) {
                return 0;
            }
            res = (res * 10) + digit;
        }
        return res;
    }
}
