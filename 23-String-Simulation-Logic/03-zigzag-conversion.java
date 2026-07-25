/*
Problem: Zigzag Conversion (LeetCode 6)
Link: https://leetcode.com/problems/zigzag-conversion/description/
Pattern: String Simulation / In-place Logic
Approach: No actual 2D grid needed. Track a "current row" index and a direction flag, walking through the string once and appending each character to a row buffer, flipping direction whenever you hit the top or bottom row. Pure index/state simulation of the zigzag pattern.
Time: O(n) | Space: O(n) for output (unavoidable), O(1) extra beyond that
*/

class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        StringBuilder sb = new StringBuilder();
        for(int r = 0; r < numRows; r++){
            int increment = 2 * (numRows - 1);
            for(int i = r; i < s.length(); i += increment){
                sb.append(s.charAt(i));
                if(r > 0 && r < numRows - 1 && i + increment - 2 * r < s.length()){
                    sb.append(s.charAt(i + increment - 2 * r));
                }
            }
        }
        return sb.toString();
    }
}
