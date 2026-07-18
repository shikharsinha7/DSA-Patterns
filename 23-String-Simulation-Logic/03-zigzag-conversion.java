/*
Problem: Zigzag Conversion (LeetCode 6)
Pattern: String Simulation / In-place Logic
Approach: No actual 2D grid needed. Track a "current row" index and a direction flag, walking through the string once and appending each character to a row buffer, flipping direction whenever you hit the top or bottom row. Pure index/state simulation of the zigzag pattern.
Time: O(n) | Space: O(n) for output (unavoidable), O(1) extra beyond that
*/

// code goes here once solved
