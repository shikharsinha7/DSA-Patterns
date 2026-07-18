/*
Problem: Segregate 0s and 1s in a Binary Array
Pattern: Array Simulation / In-place Logic
Approach: Simplified two-pointer partition - left pointer starts at 0, right at n-1. Move left forward while you see 0s, move right backward while you see 1s, then swap when both are stuck, and continue. Essentially a 2-way version of Dutch National Flag.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
