/*
Problem: Rearrange Positive and Negative Numbers Alternately (relative order not preserved)
Pattern: Array Simulation / In-place Logic
Approach: First do a Dutch-flag-style partition pass to push all negatives to one side and positives to the other. Then do a second pass swapping alternating positions starting from index 1, walking two pointers (one on the negative side, one on the positive side) forward together to interleave them.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
