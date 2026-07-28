/*
Problem: Excel Sheet Column Number / Title (LeetCode 168 / 171)
Link: https://leetcode.com/problems/excel-sheet-column-number/description/
Pattern: String Simulation / In-place Logic
Approach: Base-26 conversion logic, but offset by 1 since there's no "zero" digit (A=1, not A=0). For title-to-number, walk left to right multiplying the running total by 26 and adding the current letter's value. For number-to-title, repeatedly take (n-1) % 26 for the current letter then divide by 26, prepending each result.
Time: O(log n) | Space: O(1) extra beyond output
*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(char ch : columnTitle.toCharArray()){
            result = result * 26;
            result += (ch - 'A' + 1);
        }
        return result;
    }
}
