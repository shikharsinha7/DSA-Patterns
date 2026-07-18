/*
Problem: Roman to Integer (LeetCode 13)
Pattern: String Simulation / In-place Logic
Approach: Single left-to-right pass with a lookup map. If the current symbol's value is less than the next symbol's value, subtract it instead of adding (handles subtractive cases like IV, IX automatically without special-casing each one).
Time: O(n) | Space: O(1)
*/

// code goes here once solved
