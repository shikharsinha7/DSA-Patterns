/*
Problem: Integer to Roman (LeetCode 12)
Link: https://leetcode.com/problems/integer-to-roman/submissions/2078738266/
Pattern: String Simulation / In-place Logic
Approach: Greedy symbol-mapping - keep a fixed table of value-symbol pairs sorted largest to smallest (including the subtractive ones like 900->CM, 40->XL), and repeatedly subtract the largest possible value while appending its symbol, until the number reaches zero.
Time: O(1) (bounded by fixed symbol table) | Space: O(1)
*/

class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                sb.append(romans[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
