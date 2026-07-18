/*
Problem: Integer to Roman (LeetCode 12)
Pattern: String Simulation / In-place Logic
Approach: Greedy symbol-mapping - keep a fixed table of value-symbol pairs sorted largest to smallest (including the subtractive ones like 900->CM, 40->XL), and repeatedly subtract the largest possible value while appending its symbol, until the number reaches zero.
Time: O(1) (bounded by fixed symbol table) | Space: O(1)
*/

// code goes here once solved
