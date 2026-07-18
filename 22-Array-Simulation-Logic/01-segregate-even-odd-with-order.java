/*
Problem: Segregate Even (Ascending) and Odd (Descending) in an Array
Pattern: Array Simulation / In-place Logic
Approach: No sorting allowed if you want true O(1) space with O(n) time. Think of it as a variant of partitioning: first push all evens to the front using a two-pointer swap pass (like Dutch National Flag), then reverse the odd segment at the end to flip it from whatever order it landed in to descending. The evens will land in relative order if you're careful with the swap direction - if not, a small in-place insertion-sort pass on just the even segment (which is short) fixes it without extra space.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
