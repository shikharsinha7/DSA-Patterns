/*
Problem: Multiply Strings (LeetCode 43)
Link: https://leetcode.com/problems/multiply-strings/description/
Pattern: String Simulation / In-place Logic
Approach: Simulate manual long multiplication digit by digit - no BigInteger allowed. Use a result array of size m+n, multiply each digit pair, add to the correct position (with carry handling), then convert the final digit array to a string, stripping leading zeroes.
Time: O(m * n) | Space: O(m + n)
*/

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[m + n];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int p1 = i + j;
                int p2 = i + j + 1;

                int sum = product + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}
