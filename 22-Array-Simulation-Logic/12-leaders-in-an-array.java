/*
Problem: Leaders in an Array (element greater than everything to its right)
Pattern: Array Simulation / In-place Logic
Approach: No stack needed despite looking like a monotonic stack problem. Walk from right to left keeping track of the max seen so far - any element greater than or equal to that running max is a leader. Single backward pass, pure comparison logic.
Time: O(n) | Space: O(1) excluding output
*/

// code goes here once solved
