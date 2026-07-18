/*
Problem: Pascal's Triangle Generation (LeetCode 118 / 119)
Pattern: Array Simulation / In-place Logic
Approach: Pure construction logic, no DS trick - each row's value at position j is the sum of the previous row's values at j-1 and j (with edges always being 1). Build row by row, or for a single row (119), build in-place from right to left to avoid overwriting values you still need.
Time: O(n^2) full triangle, O(k) for a single row | Space: O(1) extra for single-row version
*/

// code goes here once solved
