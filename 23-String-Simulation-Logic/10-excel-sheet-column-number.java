/*
Problem: Excel Sheet Column Number / Title (LeetCode 168 / 171)
Pattern: String Simulation / In-place Logic
Approach: Base-26 conversion logic, but offset by 1 since there's no "zero" digit (A=1, not A=0). For title-to-number, walk left to right multiplying the running total by 26 and adding the current letter's value. For number-to-title, repeatedly take (n-1) % 26 for the current letter then divide by 26, prepending each result.
Time: O(log n) | Space: O(1) extra beyond output
*/

// code goes here once solved
